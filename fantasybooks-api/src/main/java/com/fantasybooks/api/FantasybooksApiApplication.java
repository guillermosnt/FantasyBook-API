package com.fantasybooks.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fantasybooks.api.repository.BookRepository;

@SpringBootApplication
public class FantasybooksApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasybooksApiApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(BookRepository bookRepository) {
		return args -> {

			bookRepository.save(
					new com.fantasybooks.api.model.Book(1, "El nombre del viento", "Patrick Rothfuss", "Fantasía", 5));
			bookRepository.save(new com.fantasybooks.api.model.Book(2, "El temor de un hombre sabio",
					"Patrick Rothfuss", "Fantasía", 5));
			bookRepository.save(new com.fantasybooks.api.model.Book(3, "El archivo de las tormentas",
					"Brandon Sanderson", "Fantasía", 5));
			bookRepository.save(new com.fantasybooks.api.model.Book(4, "El camino de los reyes", "Brandon Sanderson",
					"Fantasía", 5));
			bookRepository.save(new com.fantasybooks.api.model.Book(5, "El aliento de los dioses", "Brandon Sanderson",
					"Fantasía", 4));
			bookRepository.save(
					new com.fantasybooks.api.model.Book(6, "El imperio final", "Brandon Sanderson", "Fantasía", 5));

		};
	}
}
