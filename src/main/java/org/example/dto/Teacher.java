package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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

    public String getId() {
        return id;
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






