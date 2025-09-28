package com.example.demo.services;

import com.example.demo.entity.Course;
import com.example.demo.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServices
{
    @Autowired
    private CourseRepo courseRepo;

    public void save(Course c)
    {
        courseRepo.save(c);
    }

    public List<Course> getAll()
    {
        return courseRepo.findAll();
    }
}
