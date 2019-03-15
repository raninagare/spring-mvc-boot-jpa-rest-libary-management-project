package com.rani.library.service;

import com.rani.library.model.Book;

import java.util.List;


public interface BookService {
   List<Book> getBooks();
   void addBook(Book book);
   void updateBookDetails(Book book,String isbn);
   void deleteBook(String isbnNumber);

}
