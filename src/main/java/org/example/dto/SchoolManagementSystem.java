package org.example.dto;

import java.util.Arrays;

public class SchoolManagementSystem {
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;
    private int departmentCount;
    private int studentCount;
    private int teacherCount;
    private int courseCount;

    public SchoolManagementSystem() {
        this.departments = new Department[5];
        this.students = new Student[200];
        this.teachers = new Teacher[20];
        this.courses = new Course[30];
        this.departmentCount = 0;
        this.studentCount = 0;
        this.teacherCount = 0;
        this.courseCount = 0;
    }

    // Add a new department
    public void addDepartment(String departmentName) {
        if (departmentCount < 5) {
            Department department = new Department(departmentName);
            departments[departmentCount] = department;
            departmentCount++;
            System.out.println("Department " + department.getId() + " added successfully.");
        } else {
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    // Display all departments
    public void displayDepartments() {
        System.out.println("Displaying all departments:");
        for (int i = 0; i < departmentCount; i++) {
            System.out.println(departments[i]);
        }
    }

    // Add a new student
    public void addStudent(String firstName, String lastName, Department department) {
        if (studentCount < 200) {
            Student student = new Student(firstName, lastName, department);
            students[studentCount] = student;
            studentCount++;
            System.out.println(student + " added successfully.");
        } else {
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    // Display all students
    public void displayStudents() {
        System.out.println("Displaying all students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    // Add a new teacher
    public void addTeacher(String firstName, String lastName, Department department) {
        if (teacherCount < 20) {
            Teacher teacher = new Teacher(firstName, lastName, department);
            teachers[teacherCount] = teacher;
            teacherCount++;
            System.out.println(teacher + " added successfully.");
        } else {
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    // Display all teachers
    public void displayTeachers() {
        System.out.println("Displaying all teachers:");
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i]);
        }
    }

    // Add a new course
    public void addCourse(String courseName, double credit, Department department) {
        if (courseCount < 30) {
            Course course = new Course("C" + String.format("%03d", courseCount + 1), courseName, credit, department);
            courses[courseCount] = course;
            courseCount++;
            System.out.println(course + " added successfully.");
        } else {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    // Display all courses
    public void displayCourses() {
        System.out.println("Displaying all courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }
    }

    // Search a department by departmentId
    public Department searchDepartment(String departmentId) {
        for (int i = 0; i < departmentCount; i++) {
            if (departments[i].getId().equals(departmentId)) {
                return departments[i];
            }
        }
        return null;
    }

    // Search the teacher by the teacherId
    public Teacher searchTeacher(String teacherId) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].getId().equals(teacherId)) {
                return teachers[i];
            }
        }
        return null;
    }

    // Search a course by courseId
    public Course searchCourse(String courseId) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getId().equals(courseId)) {
                return courses[i];
            }
        }
        return null;
    }

    // Register a course for a student
    public void registerCourse(String studentId, String courseId) {
        Student student = searchStudent(studentId);
        Course course = searchCourse(courseId);

        if (student == null) {
            System.out.println("Cannot find any student match with studentId " + studentId + ", register course for student " + studentId + " failed.");
        } else if (course == null) {
            System.out.println("Cannot find any course match with courseId " + courseId + ", register course " + courseId + " for student " + studentId + " failed.");
        } else if (student.getCourseNum() >= 5) {
            System.out.println("Student " + studentId + " has already registered the maximum number of courses, register course " + courseId + " failed.");
        } else if (course.getStudentNum() >= 5) {
            System.out.println("Course " + courseId + " has been fully registered, register course " + courseId + " for student " + studentId + " failed.");
        } else if (Arrays.asList(course.getStudents()).contains(student)) {
            System.out.println("Student " + studentId + " has already registered Course " + courseId + ", register course " + courseId + " for student " + studentId + " failed.");
        } else {
            student.registerCourse(course);
            course.registerStudent(student);
            System.out.println("Course " + courseId + " registered successfully for student " + studentId);
        }
    }

    // Search a student by studentId
    public Student searchStudent(String studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(studentId)) {
                return students[i];
            }
        }
        return null;
    }

    // Assign a teacher to a specific course
    public void assignTeacherToCourse(String teacherId, String courseId) {
        Teacher teacher = searchTeacher(teacherId);
        Course course = searchCourse(courseId);

        if (teacher == null) {
            System.out.println("Cannot find any teacher match with teacherId " + teacherId + ", assign teacher for course " + courseId + " failed.");
        } else if (course == null) {
            System.out.println("Cannot find any course match with courseId " + courseId + ", assign teacher for course " + courseId + " failed.");
        } else {
            course.setTeacher(teacher);
            System.out.println("Teacher " + teacherId + " assigned successfully to course " + courseId);
        }
    }

    // Main method
    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();
        // Perform operations on the system
    }
}

