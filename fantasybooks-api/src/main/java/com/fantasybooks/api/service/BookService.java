package com.fantasybooks.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fantasybooks.api.model.Book;
import com.fantasybooks.api.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

}
