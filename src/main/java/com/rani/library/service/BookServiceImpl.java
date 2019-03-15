package com.rani.library.service;

import com.rani.library.dao.BookDao;
import com.rani.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    public List<Book> getBooks()
    {
        List<Book> books=new ArrayList<>();
        bookDao.findAll().forEach(books::add);
        return books;
    }
    /*public Book getBookByIsbn(String isbn)
    {

      Book book=bookDao.findById(isbn);
        if(book!=null)
            return Book(book)

    }*/

    public void addBook(Book book)
    {
        bookDao.save(book);
    }

    public void updateBookDetails(Book book,String isbn)
    {
        bookDao.save(book);
    }

    public void deleteBook(String isbnNumber)
    {
        bookDao.deleteById(isbnNumber);
    }
}
