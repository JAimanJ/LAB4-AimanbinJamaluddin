package com.example.lab4_aimanbinjamaluddin;

public class Course {
    String courseId;
    String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public Course(){

    }
}
