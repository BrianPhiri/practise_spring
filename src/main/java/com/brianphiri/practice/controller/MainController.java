package com.brianphiri.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brianphiri.practice.domain.StudentsDomain;
import com.brianphiri.practice.model.Students;
import java.util.List;

@RestController
@RequestMapping(value = "students")
public class MainController{
    @Autowired
    private StudentsDomain studentsDomain;

    @GetMapping
    public List<Students> findAll(){
        return studentsDomain.findAll();
    }

    @PostMapping
    public Students createStudent(@RequestBody Students student){
        return (Students) studentsDomain.save(student);
    }

}