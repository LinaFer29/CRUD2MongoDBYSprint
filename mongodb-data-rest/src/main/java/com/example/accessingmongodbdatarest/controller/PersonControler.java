package com.example.accessingmongodbdatarest.controller;

import java.net.URI;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingmongodbdatarest.document.Person;
import com.example.accessingmongodbdatarest.service.PersonService;


@RestController
@RequestMapping ("/api/person")
public class PersonControler {

	@Autowired
	PersonService service;
	
	@PostMapping
	public ResponseEntity<Person> crear(@RequestBody Person person){
		
		if(person.getCreateAt()==null) {
			person.setCreateAt(new Date());
		}
		Person personBd = service.save(person);
		
		
		return ResponseEntity.ok(personBd);
		
	}

	@PutMapping
	public ResponseEntity<Person> updateCellNUmber(@RequestBody Person person){
		
		return ResponseEntity.ok(service.updateCellNumber(person));
		
	}
	
	@PutMapping("/update-address")
	public ResponseEntity<Person> updateAdress (@RequestBody Person person){
		return ResponseEntity.ok(service.updateAddress(person));
	}
	@PutMapping("/update-email")
	public ResponseEntity<Person> updateEmailAddress (@RequestBody Person person){
		return ResponseEntity.ok(service.updateEmailAddress(person));
	}
	
	@DeleteMapping
	public ResponseEntity<Boolean> delete (@RequestBody Person person){
		if (service.delete(person)) {
			return new ResponseEntity<>(true,HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/{id}") 
	private ResponseEntity<Person> findById (@PathVariable String id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
	@GetMapping("/all") 
	private ResponseEntity<List<Person>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/all-upper-case") 
	private ResponseEntity<List<Person>> findAllConNombreUpperCase() {
		return ResponseEntity.ok(service.findAllConNombreUpperCase());
	}
	
	@GetMapping("/all-upper-case-repeat") 
	private ResponseEntity<List<Person>> findAllConNombreUpperCaseRepeat() {
		return ResponseEntity.ok(service.findAllConNombreUpperCaseRepeat());
	}
	
	
}
