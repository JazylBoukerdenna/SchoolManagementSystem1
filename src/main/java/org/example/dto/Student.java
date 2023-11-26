package org.example.dto;

import java.util.Arrays;

    public class Student {
        private String id; // Unique identifier for the student
        private String firstName; // First name of the student
        private String lastName; // Last name of the student
        private String name; // Full name of the student
        private Department department; // Department to which the student belongs
        private int courseNum; // Number of courses the student has registered
        private course.Course[] courses; // Array to store the registered courses
        private static int nextId = 1; // Static variable to generate unique IDs for students

        /**
         * Constructor for creating a new Student object.
         * @param firstName The first name of the student.
         * @param lastName The last name of the student.
         * @param department The department to which the student belongs.
         */
        public Student(String firstName, String lastName, Department department) {
            this.id = "S" + String.format("%03d", nextId); // Generate a unique ID for the student
            nextId++;
            this.firstName = firstName;
            this.lastName = lastName;
            this.name = firstName + " " + lastName; // Set the full name of the student
            this.department = department;
            this.courseNum = 0;
            this.courses = new course.Course[5];
        }

        // Getters and Setters for all fields, including name

        @Override
        public String toString() {
            return "Student{" +
                    "id='" + id + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", name='" + name + '\'' +
                    ", department=" + department +
                    ", courseNum=" + courseNum +
                    ", courses=" + Arrays.toString(courses) +
                    '}';
        }

        // Other methods as per requirements
    }





