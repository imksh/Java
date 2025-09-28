package com.example.demo.controllers;

import com.example.demo.entity.Course;
import com.example.demo.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/public")
public class PublicController
{
    boolean flag=false;

    @Autowired
    private CourseServices courseServices;
    @PostMapping("/add-course")
    public ResponseEntity<?> add(@RequestBody Course c)
    {
        System.out.println("add course method");
        try {
            courseServices.save(c);
            flag=true;
            HashMap<String,String > res = new HashMap<>();
            res.put("data","Added Successfully");
            return new ResponseEntity<>(res,HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/get-course")
    public ResponseEntity<?> getAllCourses()
    {
        System.out.println("get course method");
        try {
            List<Course> list =courseServices.getAll();
            flag=false;
            return new ResponseEntity<>(list,HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/check")
    public boolean check()
    {
        System.out.println("check method");
        return flag;
    }

}
