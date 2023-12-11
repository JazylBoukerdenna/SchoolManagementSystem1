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

    public void addDepartment(String departmentName) {
        if (departmentCount < departments.length) {
            departments[departmentCount++] = new Department(departmentName);
        } else {
            System.out.println("Max department reached");
        }
    }


    public void addStudent(String firstName, String lastName, String departmentId) {
        Department department =  findDepartment(departmentId);
        if (department != null && studentCount < students.length) {
            students[studentCount++] = new Student(firstName, lastName, department);
        } else {
            if (department == null) {
                System.out.println("Department cannot be found");
            } else {
                System.out.println("The maximum amount of students has been reached");
            }
        }
    }

    public void addTeacher(String firstName , String lastName , String departmentId){
        Department department = findDepartment(departmentId);
        if(department != null && teacherCount < teachers.length){
            teachers [teacherCount++] = new Teacher(firstName , lastName , department);
        }else if (department == null){
            System.out.println("Cannot find the department");
        }else{
            System.out.println("The maximum number of teacher has been reached");
        }
    }


    // Add a new course
    public void addCourse(String courseName, double credits, String departmentId) {
        Department department = findDepartment(departmentId);
        if (department != null && courseCount < courses.length) {
            courses[courseCount++] = new Course(courseName, credits, department);
        } else if (department == null) {
            System.out.println("Cannot find the department");
        } else {
            System.out.println("The maximum of courses has been reached");

        }
    }

    public Department findDepartment(String departmentId){
        for (Department department : departments){
            if  ( department != null && department.getId().equals(departmentId)){
                return department;
            }
        }
        return null;
    }

    public Student findStudent(String studentId){
        for (Student student : students){
            if  ( student != null && student.getId().equals(studentId)){
                return student;
            }
        }
        return null;
    }

    public Teacher findTeacher(String teacherId){
        for (Teacher teacher : teachers){
            if  ( teacher != null && teacher.getId().equals(teacherId)){
                return teacher;
            }
        }
        return null;
    }

    public Course findCourse(String courseId){
        for (Course course : courses){
            if  ( course != null && course.getId().equals(courseId)){
                return course;
            }
        }
        return null;
    }

    public void displayDepartments(){
        System.out.println("Displaying all the departments: ");
        for(Department department : departments){
            if (department != null){
                System.out.println(department);
            }
        }
    }
    public void displayTeachers(){
        System.out.println("Displaying all the teachers: ");
        for(Teacher teacher : teachers){
            if (teacher != null){
                System.out.println(teacher);
            }
        }
    }

    public void displayStudents(){
        System.out.println("Displaying all the students: ");
        for(Student student : students){
            if (student != null){
                System.out.println(student);
            }
        }
    }

    public void displayCourses(){
        System.out.println("Displaying all the courses: ");
        for(Course course : courses){
            if (course != null){
                System.out.println(course);
            }
        }
    }

    public void registeredCourse (String studentId, String courseId){
        Course course = findCourse(courseId);
        Student student = findStudent(studentId);
        if (student == null || course == null){
            System.out.println("Student / course not found.");
            return;
        }
        if (Arrays.asList(student.getCourses()).contains(course)){
            System.out.println("The student is already registered in this course");
            return;
        }
        if(student.getCourseNum() >= student.MAX_COURSES){
            System.out.println("The Student cannot register because he has reached the limit ");
        }

        if(student.getCourseNum() >= Course.MAX_STUDENTS){
            System.out.println("The Course has reached the maximum of students");
        }
    }

}








