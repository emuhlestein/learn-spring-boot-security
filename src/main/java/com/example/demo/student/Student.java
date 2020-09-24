package com.example.demo.student;

public class Student {

    private int id;
    private String name;

    public Student() {
    }

    public Student(Integer id,
                   String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
