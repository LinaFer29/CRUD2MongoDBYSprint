package com.example.accessingmongodbdatarest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.accessingmongodbdatarest.dao.PersonRepository;
import com.example.accessingmongodbdatarest.document.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepository dao;	
	
	@Override
	public Person updateCellNumber(Person person) {
		Optional<Person> objPerson = dao.findById(person.getId());
		Person personBd = new Person();
		
		if(objPerson.isPresent()) {
			
			personBd = objPerson.get();
			personBd.setCellNumber(person.getCellNumber());
			dao.delete(personBd);
			dao.save(personBd);
			
		}
		return personBd ;
	}
	
	@Override
	public Person save(Person person) {
			return dao.save(person);
		
	}

	@Override
	public List<Person> findAll() {
		List<Person> people = dao.findAll();
	    return people;
	}

	@Override
	public List<Person> findAllConNombreUpperCase() {
		List<Person> people = dao.findAll();
		List<Person> peopleNameUppercase =  new ArrayList();
		for(int i = 0; i < people.size();i++) {
			Person person = people.get(i);
			String name = person.getFirstName();
			if (name.equals(name.toUpperCase())) {
				peopleNameUppercase.add(person);
			}
		}
	    return peopleNameUppercase;
	}

	@Override
	public List<Person> findAllConNombreUpperCaseRepeat() {
	    List<Person> people = dao.findAll(); 
	    List<Person> peopleNameUppercaseRepeat = new ArrayList<>();  
	    Map<String, Integer> nameCountMap = new HashMap<>();

	    // Paso 1: Contar las ocurrencias de nombres en mayúsculas
	    for (Person person : people) {
	        String name = person.getFirstName();
	        if (name.equals(name.toUpperCase())) { 
	            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
	        }
	    }

	    // Paso 2: Filtrar las personas cuyo nombre en mayúsculas esté repetido
	    for (Person person : people) {
	        String name = person.getFirstName();
	        if (name.equals(name.toUpperCase()) && nameCountMap.get(name) > 1) {
	            peopleNameUppercaseRepeat.add(person);
	        }
	    }

	    return peopleNameUppercaseRepeat;
	}

	@Override
	public Person findById(String id) {
		Optional<Person> person = dao.findById(id);
		Person personBd = new Person();
		personBd = person.get();
		return personBd;
	}

	

	@Override
	public boolean delete(Person person) {
		// Encontrar Persona en la BD
		Optional<Person> objPerson = dao.findById(person.getId());
		Person personBd = new Person();
		
		if(objPerson.isPresent()) {
			// Si existe, borra el documento
			personBd = objPerson.get();
			dao.delete(personBd);
			return true;
		}
		return false;
	}


	
	@Override
	public Person updateAddress(Person person) {
		// Encontrar documento en la BD
		Optional<Person> objPerson = dao.findById(person.getId());
		Person personBd = new Person();
		
		if(objPerson.isPresent()) {
			// Si existe, setea la direccion con la que se obtiene del BodyRequest y se guarda nuevamente
			personBd = objPerson.get();
			personBd.setAddress(person.getAddress());
			dao.delete(personBd);
			dao.save(personBd);
			
		}
		return personBd ;
	}

	@Override
	public Person updateEmailAddress(Person person) {
		// Encontrar documento en la BD
		Optional<Person> objPerson = dao.findById(person.getId());
		Person personBd = new Person();
		
		if(objPerson.isPresent()) {
			// Si existe, setea el email con el que se obtiene del BodyRequest y se guarda nuevamente
			personBd = objPerson.get();
			personBd.setEmailAddress(person.getEmailAddress());
			dao.delete(personBd);
			dao.save(personBd);
			
		}
		return personBd ;
	}

	
}
