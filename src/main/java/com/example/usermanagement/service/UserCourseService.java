package com.example.usermanagement.service;

import com.example.usermanagement.model.UserCourse;
import com.example.usermanagement.repository.UserCourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserCourseService {
    private final UserCourseRepository userCourseRepository;

    public UserCourseService(UserCourseRepository userCourseRepository) {
        this.userCourseRepository = userCourseRepository;
    }

    public List<UserCourse> getAllUserCourses() {
        log.debug("Fetching all user courses");
        return userCourseRepository.findAll();
    }

    public UserCourse getUserCourseById(Long id) {
        log.debug("Fetching user course with id: {}", id);
        return userCourseRepository.findById(id).orElse(null);
    }

    public UserCourse createUserCourse(UserCourse userCourse) {
        log.debug("Creating new user course: {}", userCourse);
        return userCourseRepository.save(userCourse);
    }
}
