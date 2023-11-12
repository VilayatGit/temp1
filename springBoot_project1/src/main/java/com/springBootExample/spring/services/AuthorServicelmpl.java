package com.springBootExample.spring.services;

import com.springBootExample.spring.domain.Author;
import com.springBootExample.spring.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServicelmpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServicelmpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
