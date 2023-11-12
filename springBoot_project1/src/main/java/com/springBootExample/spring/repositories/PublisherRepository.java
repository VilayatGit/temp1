package com.springBootExample.spring.repositories;

import com.springBootExample.spring.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
