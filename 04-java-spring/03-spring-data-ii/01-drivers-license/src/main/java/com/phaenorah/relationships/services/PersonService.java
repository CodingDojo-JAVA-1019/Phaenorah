package com.phaenorah.relationships.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.phaenorah.relationships.models.Person;
import com.phaenorah.relationships.repositories.PersonRepository;

@Service
public class PersonService {	
		PersonRepository personRepo;
		PersonService(PersonRepository personRepo){
	        this.personRepo = personRepo;
	    }
		public Person getPerson(Long id) {
			return personRepo.findById(id).orElse(null);
		}
		public Person createPerson(Person person){
	    	return personRepo.save(person);
	    }
		public List<Person> getPersons() {
			return personRepo.findAll();
		}		
		public List<Person> getUnlicensedPeople() {
			return personRepo.findByLicenseIdIsNull();
		}
}	
