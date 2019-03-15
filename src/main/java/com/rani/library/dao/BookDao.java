package com.rani.library.dao;

import com.rani.library.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("BookDao")
public interface BookDao extends CrudRepository<Book,String> {


}
