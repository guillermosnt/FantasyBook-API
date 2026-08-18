package com.fantasybooks.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BookController {

    @GetMapping("/api/books")
    public String getBooks() {
        return "Aquí se encuentran los libros de fantasía";
    }
    

}
