package com.example.usermanagement.service;

import com.example.usermanagement.model.UserUniversity;
import com.example.usermanagement.repository.UserUniversityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserUniversityService {
    private final UserUniversityRepository userUniversityRepository;

    public UserUniversityService(UserUniversityRepository userUniversityRepository) {
        this.userUniversityRepository = userUniversityRepository;
    }

    public List<UserUniversity> getAllUserUniversities() {
        log.debug("Fetching all user universities");
        return userUniversityRepository.findAll();
    }

    public UserUniversity getUserUniversityById(Long id) {
        log.debug("Fetching user university with id: {}", id);
        return userUniversityRepository.findById(id).orElse(null);
    }

    public UserUniversity createUserUniversity(UserUniversity userUniversity) {
        log.debug("Creating new user university: {}", userUniversity);
        return userUniversityRepository.save(userUniversity);
    }
}
