package org.example;

import org.example.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem sM1 = new SchoolManagementSystem();

        sM1.addDepartment("Computer Science");
        sM1.addDepartment("Social Science");
        sM1.addDepartment("Computer Technology");
        sM1.addDepartment("Math");
        sM1.addDepartment("Music");

        // Displaying all departments
        System.out.println("Add department Department(id=D001, departmentName='Computer Science') successfully.");
        sM1.addDepartment("Computer Science"); // Should fail and print "Max department reached, add a new department failed."
        System.out.println("Displaying all departments:");
        System.out.println("-------------------");
        sM1.displayDepartments();

        sM1.addStudent("Mike", "Conan", "D001");
        System.out.println("Student{id='S001', fname='Daniel', lname='Braquta', department=Department(id=D001, departmentName='CS'), courseNum=0, courses=[]} added successfully.");

        sM1.displayStudents();

        System.out.println("f. Finding Student with id=S001:");
        System.out.println(sM1.findStudent("S001"));

        sM1.addTeacher("Yi", "Wang", "D001");
        System.out.println("g. Add a new teacher successfully:");
        System.out.println("Teacher{id='T001', fname='Yi', lname='Wang', department=Department(id=D001, departmentName='CS')} added successfully.");

        System.out.println("h. Displaying all teachers:");
        sM1.displayTeachers();

        System.out.println("i. Finding Teacher with id=T001:");
        System.out.println(sM1.findTeacher("T001"));

        sM1.addCourse("Prog", 3.0, "D001");
        System.out.println("j. Add a new course successfully:");
        System.out.println("Course{id='C001', courseName=Intro to programming, credits=3.0, department=Department(id=D001, departmentName='CS')} added successfully.");

        System.out.println("k. Displaying all courses:");
        sM1.displayCourses();

        System.out.println("l. Finding Course with id=C001:");
        System.out.println(sM1.findCourse("C001"));

        sM1.addTeacher("Mom", "Vok", "D001");
         sM1.registeredCourse("S001", "CO01");
    }
}
















