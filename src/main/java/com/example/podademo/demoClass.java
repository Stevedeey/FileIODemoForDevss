package com.example.podademo;

import com.example.podademo.service.StudentService;
import com.example.podademo.service.TeacherService;
import com.example.podademo.service.implementation.StudentServiceImpl;
import com.example.podademo.service.implementation.TeacherServiceImpl;

import java.util.List;
import java.util.Scanner;

public class demoClass {
    public static void main(String[] args) {


       //Testing Students
        StudentService studentService = new StudentServiceImpl();

        List<Student> listOfStudents = studentService.readStudents("/Users/decagon/desktop/Students.csv");
        studentService.writeStudents("/Users/decagon/desktop/Students.csv", listOfStudents);

        //Testing Teachers
        TeacherService teacherService = new TeacherServiceImpl();
        List<Teacher> teacherList = teacherService.readTeachers("/Users/decagon/desktop/Teachers.csv");
        teacherService.writeTeachers("/Users/decagon/desktop/Teachers.csv", teacherList);

//        Person teacher = new Person("Gabriel",  "Ojo", 30, "Lagos", "ojogabriel@gmail.com", PersonRole.Non_teaching);
//
//        Person student = new Person("Tosin", "Olaleye", 35, "Lagos", "stvolutosin69@gmail.com", PersonRole.Student);
//
//        Course course = new Course("Maths", Course.CourseCode.MTH_300);
//
//        //Show the Teacher implementation
//
//        //Difference between Abstract class and Interface
//        //Solid Principle
//        //Study the pillars of OOP - Inheritance, Polymorphism, Encapsulation, Abstraction
//
//        TeacherService service = new TeacherServiceImpl();
//        String result = service.teachCourse(teacher, student, course);
//
//        System.out.println("The result is "+  result);



//
//        Person principal = new Person();
//        principal.setFirstName(firstName);
//        principal.setLastName(lastName);
//        principal.setAge(34);
//        principal.setAddress("Lagos");
//        principal.setEmail("adebowaletijani@gmail.com");
//        principal.setRole(PersonRole.Principal);

      //  System.out.println("The details of this Principal is " + principal);


//        Person person = new Person("Oluwatosin");
//        Person personFull = new Person("Oluwatosin", "Olaleye", 35, "Lagos", "stvolutosin69@gmail.com");
//
//        System.out.println("Firstname "+ person.getFirstName());

    }
}
