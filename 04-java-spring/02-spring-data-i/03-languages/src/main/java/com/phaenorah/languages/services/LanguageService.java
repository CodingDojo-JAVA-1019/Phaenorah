package com.phaenorah.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.phaenorah.languages.models.Language;
import com.phaenorah.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
	public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
	public Language createLanguage(Language language) {
        return languageRepository.save(language);
    }
	 public Language findLanguage(Long id) {
	        Optional<Language> optionalLanguage = languageRepository.findById(id);
	        if(optionalLanguage.isPresent()) {
	            return optionalLanguage.get();
	        } else {
	            return null;
	      }
	}
	 public Language updateLanguage(Language language) {
	    	Optional<Language> optionalLanguage = languageRepository.findById(language.getId());    
	    	if(optionalLanguage.isPresent()) {
	    		Language thisLanguage = optionalLanguage.get();
	        	thisLanguage.setName(language.getName());        
	            thisLanguage.setCreator(language.getCreator());
	            thisLanguage.setCurrentVersion(language.getCurrentVersion());
	        	
	        	return languageRepository.save(thisLanguage);
	        	
	    	} else {
	            return null;
	    	}
	    }
	 public void deleteLanguage(Long id) {
	    	Optional<Language> optionalLanguage = languageRepository.findById(id);
	        if(optionalLanguage.isPresent()) {
	        	Language thisLanguage=optionalLanguage.get();
	        	languageRepository.delete(thisLanguage);
	        } 
	    }
}
