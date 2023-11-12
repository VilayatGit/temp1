package com.springBootExample.spring.services;

import com.springBootExample.spring.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
