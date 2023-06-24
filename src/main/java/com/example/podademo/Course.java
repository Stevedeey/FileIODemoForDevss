package com.example.podademo;

public class Course {

    public enum CourseCode {
        MTH_300,
        ENG_300
    }

    private String courseName;

    private CourseCode code;

    public Course(String courseName, CourseCode code) {
        this.courseName = courseName;
        this.code = code;
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseCode getCode() {
        return code;
    }

    public void setCode(CourseCode code) {
        this.code = code;
    }
}
