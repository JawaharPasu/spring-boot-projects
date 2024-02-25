package com.jawa.reactive.controller;

import com.jawa.reactive.entities.Course;
import com.jawa.reactive.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private CourseRepository courseRepository;

    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("")
    public Flux<Course> getCourses() {
        return  courseRepository.findAll();
    }

    @PostMapping("/save")
    public Mono<Course> saveCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @GetMapping("/{id}")
    public Mono<Course> findCourse(@PathVariable Long id) {
        return courseRepository.findById(id);
    }
}
