package com.example.demo.student;

public class Student {

    private final int id;
    private final String name;

    public Student(Integer id,
                   String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return name;
    }

}
