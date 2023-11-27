package org.example.dto;

    public class Teacher {
        private String id;
        private String firstName;
        private String lastName;
        private Department department;
        private String name;

        public Teacher(String id, String firstName, String lastName, Department department) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = department;
            this.name = firstName + " " + lastName;

        }

        // Getters and Setters for all fields

        @Override
        public String toString() {
            return "Teacher with ID: " + id +
                    ", Name: " + firstName + " " + lastName +
                    ", Department: " + department;
        }

        // Other methods as per requirements
    }


