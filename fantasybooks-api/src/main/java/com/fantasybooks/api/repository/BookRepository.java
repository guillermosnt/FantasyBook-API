package com.fantasybooks.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fantasybooks.api.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    // Aquí puedes definir métodos para interactuar con la base de datos
}
