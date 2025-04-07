package com.example.usermanagement.controller;

import com.example.usermanagement.model.UserBook;
import com.example.usermanagement.service.UserBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-books")
public class UserBookController {
    private final UserBookService userBookService;

    public UserBookController(UserBookService userBookService) {
        this.userBookService = userBookService;
    }

    @GetMapping
    public List<UserBook> getAllUserBooks() {
        return userBookService.getAllUserBooks();
    }

    @GetMapping("/{id}")
    public UserBook getUserBookById(@PathVariable Long id) {
        return userBookService.getUserBookById(id);
    }

    @PostMapping
    public UserBook createUserBook(@RequestBody UserBook userBook) {
        return userBookService.createUserBook(userBook);
    }
}
