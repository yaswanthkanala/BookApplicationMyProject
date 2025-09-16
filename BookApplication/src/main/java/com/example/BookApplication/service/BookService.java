package com.example.BookApplication.service;

import com.example.BookApplication.entity.Book;
import com.example.BookApplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
  public  Book addBook(Book book){
   return bookRepository.save(book);

    }
}
