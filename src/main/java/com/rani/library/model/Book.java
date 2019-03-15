package com.rani.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    private String name;
    private String author;
    //Primary  key
    @Id
    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;

    }
    public Book() {}

    public Book(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn=isbn;
    }
}
