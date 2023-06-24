package com.example.podademo.service.implementation;

import com.example.podademo.Student;
import com.example.podademo.Teacher;
import com.example.podademo.service.StudentService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> readStudents(String filePath) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean headerSkipped = false;
            while ((line = reader.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue; // Skip the header line
                }

                String[] data = line.split(",");
                String studentID = getValue(data, 0);
                String firstName = getValue(data, 1);
                String lastName = getValue(data, 2);
                String gradeLevel = getValue(data, 3);
                String email = getValue(data, 4);
                String guardianEmail1 = getValue(data, 5);
                String guardianEmail2 = getValue(data, 6);
                String isArchived = getValue(data, 7);
                String isDeleted = getValue(data, 8);

                students.add(new Student(studentID, firstName, lastName, gradeLevel, email,
                        guardianEmail1, guardianEmail2, isArchived, isDeleted));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

    @Override
    public void writeStudents(String filePath, List<Student> students) {
        try (FileWriter writer = new FileWriter(filePath)) {
            System.out.println("Writing into the student's file...\n"+ students);

            System.out.println("Students list before writing......\n");
            writer.write("StudentID,FirstName,LastName,GradeLevel,Email,GuardianEmail1,GuardianEmail2,isArchived,isDeleted\n");
            for (Student student : students) {
                writer.write(student.toCSVString() + "\n");
            }
            System.out.println("Students list before writing......\n" + students);

            System.out.println("WRITE COMPLETED ON THE STUDENTS FILE...\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getValue(String[] data, int index) {
        if (index >= 0 && index < data.length) {
            String value = data[index].trim();
            return value.isEmpty() ? "*****" : value;
        }
        return "*****";
    }


    private static boolean parseBoolean(String value) {
        return value != null && value.equalsIgnoreCase("true");
    }
}
