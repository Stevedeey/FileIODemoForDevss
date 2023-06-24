package com.example.podademo;

public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private String gradeLevel;
    private String email;
    private String guardianEmail1;
    private String guardianEmail2;
    private String isArchived;
    private String isDeleted;

    public Student(String studentID, String firstName, String lastName, String gradeLevel, String email,
                   String guardianEmail1, String guardianEmail2, String isArchived, String isDeleted) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.email = email;
        this.guardianEmail1 = guardianEmail1;
        this.guardianEmail2 = guardianEmail2;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
    }

    public String getStudentID() {
        return studentID;
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

    public String getEmail() {
        return email;
    }

    public String getGuardianEmail1() {
        return guardianEmail1;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public String isArchived() {
        return isArchived;
    }

    public String isDeleted() {
        return isDeleted;
    }

    public String toCSVString() {
        return studentID + "," + firstName + "," + lastName + "," + gradeLevel + "," +
                email + "," + guardianEmail1 + "," + guardianEmail2 + "," +
                isArchived + "," + isDeleted;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", email='" + email + '\'' +
                ", guardianEmail1='" + guardianEmail1 + '\'' +
                ", guardianEmail2='" + guardianEmail2 + '\'' +
                ", isArchived='" + isArchived + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}







