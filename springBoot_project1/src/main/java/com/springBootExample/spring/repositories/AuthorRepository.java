package com.springBootExample.spring.repositories;

import com.springBootExample.spring.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
