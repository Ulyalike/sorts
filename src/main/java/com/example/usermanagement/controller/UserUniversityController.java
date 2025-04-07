package com.example.usermanagement.controller;

import com.example.usermanagement.model.UserUniversity;
import com.example.usermanagement.service.UserUniversityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-universities")
public class UserUniversityController {
    private final UserUniversityService userUniversityService;

    public UserUniversityController(UserUniversityService userUniversityService) {
        this.userUniversityService = userUniversityService;
    }

    @GetMapping
    public List<UserUniversity> getAllUserUniversities() {
        return userUniversityService.getAllUserUniversities();
    }

    @GetMapping("/{id}")
    public UserUniversity getUserUniversityById(@PathVariable Long id) {
        return userUniversityService.getUserUniversityById(id);
    }

    @PostMapping
    public UserUniversity createUserUniversity(@RequestBody UserUniversity userUniversity) {
        return userUniversityService.createUserUniversity(userUniversity);
    }
}
