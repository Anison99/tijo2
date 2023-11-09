package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getBookList(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "book-list";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id).orElse(null);
    }

    @PostMapping
    @ResponseBody
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @PostMapping("/{id}/reserve")
    @ResponseBody
    public Book reserveBook(@PathVariable Long id) {
        return bookService.reserveBook(id);
    }

    @PostMapping("/{id}/extend-reservation")
    @ResponseBody
    public Book extendReservation(@PathVariable Long id) {
        return bookService.extendReservation(id);
    }
}
