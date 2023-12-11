package org.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
@Getter
@Setter

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private Department department;
    private int courseNum;
    private Course[] courses;

    public static int MAX_COURSES = 5;
    private static int nextId = 1;

    /**
     * Constructor for creating a new Student object.
     * @param firstName The first name of the student.
     * @param lastName The last name of the student.
     * @param department The department where the student belongs.
     */
    public Student(String firstName, String lastName, Department department) {
        this.id = "S" + String.format("%03d", nextId++);
        nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.courseNum = 0;
        this.courses = new Course[MAX_COURSES];
    }


}







