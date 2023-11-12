package com.springBootExample.spring.services;

import com.springBootExample.spring.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
