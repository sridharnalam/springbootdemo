package com.example.demo.service;

import com.example.demo.data.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Chiya", 2, LocalDate.of(2020, 8, 29), "chiya@mail.com"),
                new Student(2L, "Jashu", 13, LocalDate.of(2009, 11, 06), "jashu@mail.com")
        );
    }
}
