package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
@Getter
@Setter
@ToString

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

    /**
     * Registers a course for the student.
     * @param course The course to be registered.
     */
    public void addCourse (Course course) {
        if (courseNum < MAX_COURSES) {
            courses[courseNum] = course;
            courseNum++;
        } else {
            System.out.println("This student reached the maximum amount of courses " + id);
         }
    }


    @Override
    public String toString() {
        return "Student details: " +
                "ID: " + id +
                ", First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Department: " + department +
                ", Course Number: " + courseNum +
                ", Courses: " + Arrays.toString(courses);
    }
}







