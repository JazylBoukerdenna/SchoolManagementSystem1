package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@ToString
@Setter
public class SchoolManagementSystem {
    private Department[] departments = new Department[5];
    private Student[] students = new Student[200];
    private Teacher[] teachers = new Teacher[20];
    private Course[] courses = new Course[30];
    private int departmentCount = 0;
    private int studentCount = 0;
    private int teacherCount = 0;
    private int courseCount = 0;

    public void addDepartment(String departmentName) { // Method to add a department
        if (departmentCount < departments.length) {
            departments[departmentCount++] = new Department(departmentName);
        } else {
            System.out.println("Max department reached");
        }
    }

    public void addTeacher(String firstName, String lastName, String departmentId) {  // Method to add a teacher
        Department department = findDepartment(departmentId);
        if (department != null && teacherCount < teachers.length) {
            teachers[teacherCount++] = new Teacher(firstName, lastName, department);
        } else if (department == null) {
            System.out.println("Cannot find the department");
        } else {
            System.out.println("The maximum number of teachers has been reached");
        }
    }

    public Department findDepartment(String departmentId) { // Method to find a department by its ID
        for (Department department : departments) {
            if (department != null && department.getId().equals(departmentId)) {
                return department;
            }
        }
        return null;
    }

    public Course findCourse(String courseId) {    // Method to find a course with its ID
        for (Course course : courses) {
            if (course != null && course.getId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public void registeredCourse(String studentId, String courseId) {  // Method to register a student to a course
        Course course = findCourse(courseId);
        Student student = findStudent(studentId);
        if (student == null || course == null) {
            System.out.println("Student / course not found.");
            return;
        }
        if (Arrays.asList(student.getCourses()).contains(course)) {
            System.out.println("The student is already registered in this course");
            return;
        }
        if (student.getCourseNum() >= Student.MAX_COURSES) {
            System.out.println("The Student cannot register because they have reached the limit ");
        }

        if (student.getCourseNum() >= Course.MAX_STUDENTS) {
            System.out.println("The Course has reached the maximum number of students");
        }
    }

    public void addStudent(String firstName, String lastName, String departmentId) {  // Method to add a student
        Department department = findDepartment(departmentId);
        if (department != null && studentCount < students.length) {
            students[studentCount++] = new Student(firstName, lastName, department);
        } else {
            if (department == null) {
                System.out.println("Department cannot be found");
            } else {
                System.out.println("The maximum number of students has been reached");
            }
        }
    }

    public void displayDepartments() {     // Method to display all departments
        System.out.println("Displaying all the departments: ");
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    public void displayTeachers() {     // Method to display all teachers
        System.out.println("Displaying all the teachers: ");
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    public void addCourse(String courseName, double credits, String departmentId) {  // Method to add a course
        Department department = findDepartment(departmentId);
        if (department != null && courseCount < courses.length) {
            courses[courseCount++] = new Course(courseName, credits, department);
        } else if (department == null) {
            System.out.println("Cannot find the department");
        } else {
            System.out.println("The maximum number of courses has been reached");
        }
    }

    public Student findStudent(String studentId) {      // Method to find a student by their ID
        for (Student student : students) {
            if (student != null && student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public Teacher findTeacher(String teacherId) {  // Method to find a teacher by their ID
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    public void displayStudents() {   // Method to display all students
        System.out.println("Displaying all the students: ");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public void displayCourses() {   // Method to display all courses
        System.out.println("Displaying all the courses: ");
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }
}

