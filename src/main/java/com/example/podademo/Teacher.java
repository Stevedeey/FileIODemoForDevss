package com.example.podademo;

public class Teacher {
    private String teacherID;
    private String email;
    private String firstName;
    private String lastName;
    private String gradeLevel;

    public Teacher(String teacherID, String email, String firstName, String lastName, String gradeLevel) {
        this.teacherID = teacherID;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public String toCSVString() {
        return teacherID + "," + email + "," + firstName + "," + lastName + "," + gradeLevel;
    }
}
