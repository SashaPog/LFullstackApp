package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private List<Person> people = new ArrayList<>();

    @PostMapping("/addPerson")
    public Person addPerson(@RequestParam String firstName, @RequestParam String lastName) {
        Person person = new Person(firstName , lastName);
        people.add(person);
        return person;
    }

    @GetMapping("/getPeople")
    public List<Person> getPeople() {
        return people;
    }
}
