package com.airtribe.learntrack.entity;

/**
 * Abstract class demonstrating ABSTRACTION and ENCAPSULATION.
 * Acts as the base for all human-related entities in the system.
 */
public abstract class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Method to be overridden by subclasses (Polymorphism)
    public String getInfo() {
        return "ID: " + id + " | Name: " + name + " | Email: " + email;
    }

    // Getters for encapsulation
    public int getId() { return id; }
    public String getName() { return name; }
}
