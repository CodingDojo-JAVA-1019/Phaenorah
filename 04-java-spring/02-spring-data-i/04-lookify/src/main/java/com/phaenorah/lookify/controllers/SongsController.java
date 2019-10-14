package com.phaenorah.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.phaenorah.lookify.models.Song;
import com.phaenorah.lookify.services.SongService;

@Controller
public class SongsController {
	private final SongService songService;
    public SongsController(SongService songService){
        this.songService = songService;
    }
    @RequestMapping("/")
	public String index() {
		return "/views/index.jsp";
    }
    @RequestMapping("/dashboard")
    public String songs(Model model) {
        List<Song> songs = songService.allSongs();
        model.addAttribute("songs", songs);
        return "/views/dashboard.jsp";
    }
    @RequestMapping("/songs/new")
    public String newSong(@ModelAttribute("song") Song song) {
        return "/views/new.jsp";
    }
    @RequestMapping(value="/songs", method=RequestMethod.POST)
    public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "/views/new.jsp";
        } else {
            songService.createSong(song);
            return "redirect:/dashboard";
        }
    }
    @RequestMapping("/songs/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
    	Song song = songService.findSong(id);
        model.addAttribute("song", song);
        return "/views/show.jsp";
    }
    @RequestMapping("/delete/{id}")
    public String deleteSong(@PathVariable("id") Long id){
        songService.deleteSong(id);
        return "redirect:/dashboard";
    }
    @RequestMapping("/search/topten")
    public String topSongs(Model model){
        model.addAttribute("songs", songService.topSongs());
        return "/views/topten.jsp";
    }
    @RequestMapping("/search")
    public String searchArtist(@RequestParam("artist") String artist, Model model){
    	List<Song> songs = songService.searchArtist(artist);
    	model.addAttribute("artist", artist);
    	model.addAttribute("songs", songs);
        return "/views/artist.jsp";
    }

}
