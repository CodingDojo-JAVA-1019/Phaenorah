package com.phaenorah.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.phaenorah.lookify.models.Song;
import com.phaenorah.lookify.repositories.SongRepository;

@Service
public class SongService {
	SongRepository songRepo;
    SongService(SongRepository songRepo){
        this.songRepo = songRepo;
    }   
    public List<Song> allSongs(){
        return songRepo.findAll();
    }
    //create new song
    public Song createSong(Song song){
    	return songRepo.save(song);
    }
    public Song findSong(Long id) {
        Optional<Song> optionalSong = songRepo.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }
    }
    public void deleteSong(Long id){
    	Optional<Song> optionalSong = songRepo.findById(id);
	    if(optionalSong.isPresent()) {
	    	Song thisSong=optionalSong.get();
	    	songRepo.delete(thisSong);
	   }
    }    
    public List<Song> topSongs(){

        return songRepo.findTop10ByOrderByRatingDesc();
    }
    public List<Song> searchArtist(String artist){
        return songRepo.findByArtistContaining(artist);
    }

}
