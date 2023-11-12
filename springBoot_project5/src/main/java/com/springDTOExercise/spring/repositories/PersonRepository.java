package com.springDTOExercise.spring.repositories;

import com.springDTOExercise.spring.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
