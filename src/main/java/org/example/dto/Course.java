package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class Course {
    public static int MAX_STUDENTS = 30;
    private static int nextId = 1;
    private String id;
    private String courseName;
    private double credit;
    private Teacher teacher;
    private Department department;
    private Student[] students;
    private int studentNum;

    public Course(String courseName, double credit, Department department) {
        this.id = "C" + String.format("%03d", nextId++);
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.students = new Student[MAX_STUDENTS];
        this.studentNum = 0;
    }

    public void addStudent(Student student) {
        if (studentNum < MAX_STUDENTS) {
            students[studentNum] = student;
            studentNum++;
        } else {
            System.out.println("The Maximum number of students reached the course" + id);
        }
    }

    @Override
    public String toString() {
        return "Course ID: " + id +
                ", Name: " + courseName +
                ", Credit: " + credit +
                ", Teacher: " + teacher +
                ", Department: " + department +
                ", Students: " + Arrays.toString(students) +
                ", Student Count: " + studentNum;
    }
}





