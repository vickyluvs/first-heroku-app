package com.example.demo.jfs_docker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @GetMapping
    public String sayHello(){
        return "Hello Docker";

    }
}

