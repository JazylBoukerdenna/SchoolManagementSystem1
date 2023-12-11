package org.example;

import org.example.dto.Course;
import org.example.dto.SchoolManagementSystem;
import org.example.dto.Student;
import org.example.dto.Teacher;

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

        sM1.displayDepartments();

        sM1.addStudent("Mike", "Conan", "D001");
// Check if the student is not null before printing
        Student student = sM1.findStudent("S001");
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }

        sM1.displayStudents();

        System.out.println("f. Finding Student with id=S001:");
        student = sM1.findStudent("S001");
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }

        sM1.addTeacher("Yi", "Wang", "D001");
        System.out.println("g. Add a new teacher successfully:");
        System.out.println("Teacher{id ='T001', fname='Yi', lname='Wang', department= Computer Science");

        System.out.println("h. Displaying all teachers:");
        sM1.displayTeachers();

        System.out.println("i. Finding Teacher with id=T001:");
        Teacher teacher = sM1.findTeacher("T001");
        if (teacher != null) {
            System.out.println(teacher);
        } else {
            System.out.println("Teacher not found.");
        }

        sM1.addCourse("Prog", 3.0, "C001");
        System.out.println("j. Add a new course successfully:");
        System.out.println("Course{id='C001', courseName=Intro to programming, credits=3.0, department=Department(id=D001, departmentName='Computer Science')} ");

        System.out.println("k. Displaying all courses:");
        sM1.displayCourses();

        System.out.println("l. Finding Course with id=C001:");
        Course course = sM1.findCourse("C001");
        if (course != null) {
            System.out.println(course);
        } else {
            System.out.println("Course not found.");
        }

        sM1.addTeacher("Mom", "Vok", "D001");
        sM1.registeredCourse("S001", "CO01");

    }
}
















