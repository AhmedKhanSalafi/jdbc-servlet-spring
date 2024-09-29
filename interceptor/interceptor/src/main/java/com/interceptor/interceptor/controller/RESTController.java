package com.interceptor.interceptor.controller;



import com.interceptor.interceptor.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    // Return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        // Add Data to POJO
        Student student1 = new Student(1,"Adwitiya", "Mourya");
        Student student2 = new Student(2,"David", "Goggins");
        Student student3 = new Student(3,"Andrew", "Huberman");

        // Create a new List
        List<Student> myList = new ArrayList<Student>();

        // Add Data to the list
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);

        return myList;
    }
}


