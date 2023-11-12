package com.springbootlombok.spring.repositories;

import com.springbootlombok.spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
