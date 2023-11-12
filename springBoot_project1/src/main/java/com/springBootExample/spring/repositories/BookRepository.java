package com.springBootExample.spring.repositories;

import com.springBootExample.spring.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
