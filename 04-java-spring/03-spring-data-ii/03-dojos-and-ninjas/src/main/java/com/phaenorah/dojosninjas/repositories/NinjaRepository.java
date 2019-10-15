package com.phaenorah.dojosninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.phaenorah.dojosninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();

}
