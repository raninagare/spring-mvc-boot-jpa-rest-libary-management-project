package com.rani.library.controller;

import com.rani.library.model.Book;
import com.rani.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@EnableWebMvc
@Configuration
@RestController
public class LibraryController extends WebMvcConfigurerAdapter {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.getBooks();

    }

  /* @RequestMapping(value = "/books/{isbn}", method = RequestMethod.GET)
    public Book getBook(@PathVariable("isbn") String isbn) {
        return bookService.getBook(name);

    }*/

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
         bookService.addBook(book);

    }

    @RequestMapping(value = "/books/{isbn}", method = RequestMethod.PUT)
    public void updateBook(@RequestBody Book book,@PathVariable("isbn") String isbn) {
        bookService.updateBookDetails(book,isbn);

    }

    @RequestMapping(value = "/books/{isbn}", method = RequestMethod.DELETE)
    public void updateBook(@PathVariable("isbn") String isbn) {
        bookService.deleteBook(isbn);

    }
}

