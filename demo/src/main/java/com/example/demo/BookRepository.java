package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByReserved(boolean reserved);
    List<Book> findByAuthor(String author);
    Book findByIsbn(String isbn);

    // Dodaj inne metody, jeśli są potrzebne
}
