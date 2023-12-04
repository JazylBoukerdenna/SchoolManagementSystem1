package org.example.dto;

import java.util.Arrays;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String name;
    private Department department;
    private int courseNum;
    private Course[] courses;
    private static int nextId = 1;

    /**
     * Constructor for creating a new Student object.
     * @param firstName The first name of the student.
     * @param lastName The last name of the student.
     * @param department The department where the student belongs.
     */
    public Student(String firstName, String lastName, Department department) {
        this.id = "S" + String.format("%03d", nextId); // Generate a unique ID for the student
        nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
        this.department = department;
        this.courseNum = 0;
        this.courses = new Course[5];
    }

    // Getters and Setters for all fields

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public Course[] getCourses() {
        return courses;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    /**
     * Registers a course for the student.
     * @param course The course to be registered.
     */
    public void registerCourse(Course course) {
        if (courseNum < 5) {
            courses[courseNum] = course;
            courseNum++;
            System.out.println("Course " + course.getId() + " registered successfully for student " + id);
        } else {
            System.out.println("Student " + id + " has already registered the maximum number of courses.");
        }
    }

    /**
     * Prints the details of the student.
     */
    public void printDetails() {
        System.out.println("Student details:");
        System.out.println("ID: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Course Number: " + courseNum);
        System.out.println("Courses: " + Arrays.toString(courses));
    }

    @Override
    public String toString() {
        return "Student details: " +
                "ID: " + id +
                ", First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Full Name: " + name +
                ", Department: " + department +
                ", Course Number: " + courseNum +
                ", Courses: " + Arrays.toString(courses);
    }
}







