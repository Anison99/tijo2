package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private final BookService bookService;

    @Autowired
    public UserController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String getBookList(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "book-list";
    }
}
