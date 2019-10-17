package com.phaenorah.beltreviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.phaenorah.beltreviewer.models.Event;

public interface EventRepository extends CrudRepository<Event, Long>{
	List<Event> findByState(String state);
	List<Event> findByStateIsNot(String state);

}
