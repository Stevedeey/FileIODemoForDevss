package com.example.podademo.service;

import com.example.podademo.Course;
import com.example.podademo.Person;
import com.example.podademo.Teacher;

import java.util.List;

public interface TeacherService {

     String teachCourse(Person teacher, Person student, Course course);

     String markAttendance (Person teacher, Person student);

     List<Teacher> readTeachers(String filePath);

     void writeTeachers(String filePath, List<Teacher> teachers);
}
