package com.katt;

import com.katt.model.Student;
import com.katt.model.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "john@code.cool", LocalDate.of(1981,7,31));

        Student buildedStudent = Student.builder()
                .email("new@code.cool")
                .birthDate(LocalDate.of(1990, 3, 20))
                .build();

        printStudent(student);
        printStudent(buildedStudent);

        Teacher leila = Teacher.builder()
                .name("Leila")
                .student(student)
                .student(buildedStudent)
                .build();
        System.out.println(leila);

//        Teacher.builder()
//                .student(student)
//                .build();
    }

    private static void printStudent(Student student) {
        System.out.println(student);
        System.out.println(student.getBirthDate());
        System.out.println("===============");
    }
}
