package org.example.dto;

public class Teacher {
    private String id;
    private String firstName;
    private String lastName;
    private Department department;

    private static int nextId = 1;

    public Teacher(String firstName, String lastName, Department department) {
        this.id = "T" + String.format("%03d", nextId++);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    // Getters and Setters for all fields

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                '}';
    }
}





