package org.example.dto;

public class Department {

        private String id;
        private String departmentName;
        private static int nextId = 1;

        public Department(String departmentName) {
            this.id = "D" + String.format("%03d", nextId);
            nextId++;
            this.departmentName = departmentName;
        }

        // Getters and Setters for all fields, including nextId

        @Override
        public String toString() {
            return "Department{" +
                    "id='" + id + '\'' +
                    ", departmentName='" + departmentName + '\'' +
                    '}';
        }

        // Other methods as per requirements
    }


