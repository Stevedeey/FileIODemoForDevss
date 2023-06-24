package com.example.podademo.service.implementation;

import com.example.podademo.Course;
import com.example.podademo.Person;
import com.example.podademo.PersonRole;
import com.example.podademo.Teacher;
import com.example.podademo.service.TeacherService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public String teachCourse(Person teacher, Person student, Course course) {
        if(!teacher.getRole().equals(PersonRole.Teacher)) {
            return "Sorry, you are not authorized to teach this Course !";
        }

        return "Welcome " + teacher.getFirstName() + " The course you are teaching is "+ course.getCourseName() +
                " and the name of your student is " + student.getFirstName();
    }

    @Override
    public String markAttendance(Person teacher, Person student) {
        return null;
    }

    @Override
    public List<Teacher> readTeachers(String filePath) {
        List<Teacher> teachers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean headerSkipped = false;
            while ((line = reader.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue; // Skip the header line
                }

                String[] data = line.split(",");
                String teacherID = getValue(data, 0);
                String email = getValue(data, 1);
                String firstName = getValue(data, 2);
                String lastName = getValue(data, 3);
                String gradeLevel = getValue(data, 4);

                teachers.add(new Teacher(teacherID, email, firstName, lastName, gradeLevel));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return teachers;
    }

    private static String getValue(String[] data, int index) {
        if (index >= 0 && index < data.length) {
            String value = data[index].trim();
            return value.isEmpty() ? "null" : value;
        }
        return null;

    }

    @Override
    public void writeTeachers(String filePath, List<Teacher> teachers) {
        try (FileWriter writer = new FileWriter(filePath)) {
            System.out.println("writing into the teacher's file...");
            writer.write("TeacherID,Email,FirstName,LastName,GradeLevel\n");
            for (Teacher teacher : teachers) {
                writer.write(teacher.toCSVString() + "\n");
            }
            System.out.println("WRITE COMPLETED ON THE TEACHERS FILE");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
