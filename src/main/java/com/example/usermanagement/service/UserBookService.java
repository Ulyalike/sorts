package com.example.usermanagement.service;

import com.example.usermanagement.model.UserBook;
import com.example.usermanagement.repository.UserBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserBookService {
    private final UserBookRepository userBookRepository;

    public UserBookService(UserBookRepository userBookRepository) {
        this.userBookRepository = userBookRepository;
    }

    public List<UserBook> getAllUserBooks() {
        log.debug("Fetching all user books");
        return userBookRepository.findAll();
    }

    public UserBook getUserBookById(Long id) {
        log.debug("Fetching user book with id: {}", id);
        return userBookRepository.findById(id).orElse(null);
    }

    public UserBook createUserBook(UserBook userBook) {
        log.debug("Creating new user book: {}", userBook);
        return userBookRepository.save(userBook);
    }
}
