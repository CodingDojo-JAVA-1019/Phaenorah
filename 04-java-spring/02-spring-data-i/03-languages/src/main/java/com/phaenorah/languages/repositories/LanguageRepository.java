package com.phaenorah.languages.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.phaenorah.languages.models.Language;

@Repository
public interface  LanguageRepository extends CrudRepository<Language,Long> {
	List<Language> findAll();
    
    List<Language> findByCreatorContaining(String search);   
    
    Long deleteByIdIs(Long Id);   

}
