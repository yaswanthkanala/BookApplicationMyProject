package com.example.BookApplication.controller;

import com.example.BookApplication.entity.Book;
import com.example.BookApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/v1")
public class BookController {


    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService =bookService;
    }
    @PostMapping("/addBook")
    public ResponseEntity addBook(@RequestBody Book book){
     Book savedBook=  bookService.addBook(book);
     return ResponseEntity.ok(savedBook);
    }
}
