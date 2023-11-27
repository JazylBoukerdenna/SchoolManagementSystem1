package org.example.dto;

import java.util.Arrays;

    public class Student {
        private String id; 
        private String firstName;  
        private String lastName;  
        private String name;  
        private Department department; 
        private int courseNum;
        private course.Course[] courses;  
        private static int nextId = 1;  

        /**
         * Constructor for creating a new Student object.
         * @param firstName The first name of the student.
         * @param lastName The last name of the student.
         * @param department The department to which the student belongs.
         */
        
        public Student(String firstName, String lastName, Department department) {
            this.id = "S" + String.format("%03d", nextId);  
            nextId++;
            this.firstName = firstName;
            this.lastName = lastName;
            this.name = firstName + " " + lastName; // Set the full name of the student
            this.department = department;
            this.courseNum = 0;
            this.courses = new course.Course[5];
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





