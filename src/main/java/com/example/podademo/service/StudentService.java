package com.example.podademo.service;

import com.example.podademo.Student;

import java.util.List;

public interface StudentService {

    List<Student> readStudents(String filePath);

    void writeStudents(String filePath, List<Student> students);
}
