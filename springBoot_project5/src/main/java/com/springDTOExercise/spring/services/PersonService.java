package com.springDTOExercise.spring.services;

import com.springDTOExercise.spring.entities.Person;
import com.springDTOExercise.spring.model.PersonDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonService {

    List<PersonDTO> listPersons();

    Optional<PersonDTO> getPersonById(Long id);

    PersonDTO saveNewPerson(PersonDTO personDTO);

    Boolean deletePersonById(Long id);

    Optional<PersonDTO> updatePerson(Long id,PersonDTO personDTO);


}
