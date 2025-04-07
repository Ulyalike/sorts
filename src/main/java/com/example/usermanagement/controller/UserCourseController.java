package com.example.usermanagement.controller;

import com.example.usermanagement.model.UserCourse;
import com.example.usermanagement.service.UserCourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-courses")
public class UserCourseController {
    private final UserCourseService userCourseService;

    public UserCourseController(UserCourseService userCourseService) {
        this.userCourseService = userCourseService;
    }

    @GetMapping
    public List<UserCourse> getAllUserCourses() {
        return userCourseService.getAllUserCourses();
    }

    @GetMapping("/{id}")
    public UserCourse getUserCourseById(@PathVariable Long id) {
        return userCourseService.getUserCourseById(id);
    }

    @PostMapping
    public UserCourse createUserCourse(@RequestBody UserCourse userCourse) {
        return userCourseService.createUserCourse(userCourse);
    }
}
