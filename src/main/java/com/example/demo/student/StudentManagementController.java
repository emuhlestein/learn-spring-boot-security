package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("admin/api/v1/students")
public class StudentManagementController {
    private static int id = 10;

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Maria Jones"),
            new Student(3, "Anna Smith")
    );

    @GetMapping
    public List<Student> getAllStudents() {
        return STUDENTS;
    }

    @PostMapping
    public int registerStudent(@RequestBody Student student) {
        System.out.println(student);
        return id++;
    }

    @DeleteMapping(path = "{id}")
    public void deleteStudent(@PathVariable int id) {
        System.out.println(id);
    }

    @PutMapping(path = "{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {
        System.out.println(String.format("%s %s", id, student));
    }
}
