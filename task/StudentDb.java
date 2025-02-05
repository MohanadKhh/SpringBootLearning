package com.example.demo.spring.controller.task;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class StudentDb {
    Map<Integer, Student> students = new HashMap<>();

    private static volatile StudentDb instance;

    public static StudentDb getInstance() {
        if (instance == null) {
            synchronized (StudentDb.class) {
                if (instance == null) {
                    instance = new StudentDb();
                }
            }
        }
        return instance;
    }

    public void createStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Collection<Student> readStudent() {
        return students.values();
    }

    public void updateStudent(int id, Student updatedStudent) {
        students.replace(id, updatedStudent);
    }

    public void deleteStudent(int id) {
        students.remove(id);
    }

    public Student findFirstStudent() {
        AtomicInteger id = new AtomicInteger();
        students.keySet().stream().findFirst().ifPresent(id::set);
        return students.get(id.get());
    }
}