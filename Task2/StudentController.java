package com.example.demo.spring.controller.task;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("task")
public class StudentController {

    final StudentDb studentDb = StudentDb.getInstance();

    @GetMapping("create")
    public String createApi(@RequestBody Student student) {
        studentDb.createStudent(student);
        return "success";
    }

    @GetMapping("update/{id}")
    public String updateApi(@PathVariable int id
    , @RequestBody Student newStudent) {
        studentDb.updateStudent(id, newStudent);
        return "success";
    }

    @GetMapping("delete/{id}")
    public String deleteApi(@PathVariable int id) {
        studentDb.deleteStudent(id);
        return "success";
    }

    @GetMapping("read")
    public Collection<Student> readApi() {
        return studentDb.readStudent();
    }

    @GetMapping("first")
    public String firstApi() {
        return studentDb.findFirstStudent().toString();
    }
}
