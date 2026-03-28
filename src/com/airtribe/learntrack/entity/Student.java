package com.airtribe.learntrack.entity;

/**
 * Demonstrates INHERITANCE by extending Person.
 */
public class Student extends Person {
    private String batch;
    private boolean active;

    public Student(int id, String name, String email, String batch) {
        super(id, name, email); // Invoking parent constructor
        this.batch = batch;
        this.active = true;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Batch: " + batch + " | Status: " + (active ? "Active" : "Inactive");
    }

    public void setActive(boolean active) { this.active = active; }
}
