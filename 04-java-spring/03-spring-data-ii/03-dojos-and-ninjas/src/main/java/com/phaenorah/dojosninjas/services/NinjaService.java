package com.phaenorah.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.phaenorah.dojosninjas.models.Ninja;
import com.phaenorah.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {	
		NinjaRepository ninjaRepo;	
	NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	public List<Ninja> findAllNinja() {
		return ninjaRepo.findAll();
	}
	public Ninja createNinja(String firstName, String lastName, Integer age) {
		Ninja ninja = new Ninja();
		
		ninja.setFirstName(firstName);
		ninja.setLastName(lastName);
		ninja.setAge(age);
		
		return createNinja(ninja);
	}
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public Ninja findById(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		if (ninja.isPresent()) {
			return ninja.get();
		}
		return null;
	}

}
