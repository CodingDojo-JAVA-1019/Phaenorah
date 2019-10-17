package com.phaenorah.beltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.phaenorah.beltreviewer.models.Message;

public  interface MessageRepository extends CrudRepository<Message, Long>{

}
