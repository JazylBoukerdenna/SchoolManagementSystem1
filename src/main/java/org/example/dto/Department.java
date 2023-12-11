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

    // Getters and Setters for all fields

    public String getId() {
        return id;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department ID: " + id + ", Name: " + departmentName;
    }

    // Add a new department
    public void addDepartment(String departmentName) {

    }

    // Display all departments
    public void displayDepartments() {
        // Implementation to display all departments
    }

    // Search a department by departmentId
    public Department searchDepartment(String departmentId) {
        return null; // Placeholder, replace with actual implementation
    }
}




