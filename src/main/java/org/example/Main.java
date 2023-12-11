package org.example;

import org.example.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();
        schoolManagementSystem.addDepartment("Computer Science");
        System.out.println("1. Add a new department");
        schoolManagementSystem.displayDepartments();
        System.out.println("2. Display departments");
        System.out.println(schoolManagementSystem.findDepartment("D001"));

        schoolManagementSystem.addStudent("Daniel", "Braquta", "D001");
        System.out.println("3. Add a new student");
        schoolManagementSystem.displayStudents();
        System.out.println("4. Display students");
        System.out.println(schoolManagementSystem.findStudent("S001"));

        schoolManagementSystem.addTeacher("Yi", "Wang", "D001");
        System.out.println("5. Add a new teacher");
        schoolManagementSystem.displayTeachers();
        System.out.println("6. Display teachers");
        System.out.println(schoolManagementSystem.findTeacher("T001"));

        schoolManagementSystem.addCourse("Programming", 3.0, "D001");
        System.out.println("7. Add a new course");
        schoolManagementSystem.displayCourses();
        System.out.println("8. Display courses");


            }
        }





