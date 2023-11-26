package org.example.dto;

import java.util.Arrays;

public class course {
    public class Course {
        private String id;
        private String courseName;
        private double credit;
        private Teacher teacher;
        private Department department;
        private Student[] students;
        private int studentNum;

        public Course(String id, String courseName, double credit, Department department) {
            this.id = id;
            this.courseName = courseName;
            this.credit = credit;
            this.department = department;
            this.teacher = null;
            this.students = new Student[5];
            this.studentNum = 0;
        }

        // Getters and Setters for all fields, including studentNum

        public int getStudentNum() {
            return studentNum;
        }

        public void setStudentNum(int studentNum) {
            this.studentNum = studentNum;
        }

        // Other properties as per requirements

        public String getId() {
            return id;
        }

        public String getCourseName() {
            return courseName;
        }

        public double getCredit() {
            return credit;
        }

        public Teacher getTeacher() {
            return teacher;
        }

        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }

        public Department getDepartment() {
            return department;
        }

        public Student[] getStudents() {
            return students;
        }

        public void setStudents(Student[] students) {
            this.students = students;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "id='" + id + '\'' +
                    ", courseName='" + courseName + '\'' +
                    ", credit=" + credit +
                    ", teacher=" + teacher +
                    ", department='" + department + '\'' +
                    ", students=" + Arrays.toString(students) +
                    ", studentNum=" + studentNum +
                    '}';
        }

        // Other methods as per requirements
    }

}
