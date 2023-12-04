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


        @Override
        public String toString() {
            return "Department ID: " + id + ", Name: " + departmentName;
        }

}




