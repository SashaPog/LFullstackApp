package com.example.demo;

public class Person {
    private static int idCounter = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName ;
    }

    public String getLastName() {
        return lastName;
    }
}
