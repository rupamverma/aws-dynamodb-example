package com.rupam.awsdynamodbexample.controller;

import com.rupam.awsdynamodbexample.entity.Person;
import com.rupam.awsdynamodbexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/crud")
public class PersonController {

    @Autowired
    PersonService personService;
    @PostMapping("/v1/persons")
    public ResponseEntity<Person> addPerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.addPerson(person));
    }

    @GetMapping("/v1/persons/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") String personId){
        return ResponseEntity.ok(personService.loadPerson(personId));
    }

    @DeleteMapping("/v1/persons")
    public ResponseEntity<String> deletePerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.delete(person));
    }

    @PutMapping("/v1/persons")
    public ResponseEntity<String> updatePerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.update(person));
    }
}
