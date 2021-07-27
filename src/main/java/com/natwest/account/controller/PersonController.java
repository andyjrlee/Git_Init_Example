package com.natwest.account.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.account.domain.Person;


@RestController
class PersonController {
	List<Person> people = new ArrayList<>();

	@GetMapping("/getAll")
	public List<Person> getAll() {
		return this.people;
	}

	@PostMapping("/create")
	public boolean create(@RequestBody Person person) {
		return this.people.add(person);
	}
	
	@PutMapping("/update/{id}")
	public Person updatePerson(@PathVariable int id, @RequestBody Person person) {
		this.people.remove(id);
		this.people.add(id, person);
		return this.people.get(id);
	}
	
	@DeleteMapping("delete/{id}")	
	public Person removePerson(@PathVariable int id) {
	return this.people.remove(id);
	}
}