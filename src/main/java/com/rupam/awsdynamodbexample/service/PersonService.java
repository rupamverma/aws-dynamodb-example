package com.rupam.awsdynamodbexample.service;

import com.rupam.awsdynamodbexample.entity.Person;
import com.rupam.awsdynamodbexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person addPerson(Person person){
        return personRepository.savePerson(person);
    }

    public Person loadPerson(String personId){
        return personRepository.findPersonByPersonId(personId);
    }

    public String delete(Person person){
        return personRepository.deletePerson(person);
    }

    public String update(Person person){
        return personRepository.editPerson(person);
    }
}
