package com.phaenorah.dojosninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phaenorah.dojosninjas.models.Dojo;
import com.phaenorah.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {
	 	DojoRepository dojoRepo;
	 	DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	public List<Dojo> findAll() {
		return dojoRepo.findAll();
	}
	public Dojo findById(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}

}
