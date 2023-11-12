package com.springDTOExercise.spring.mappers;

import com.springDTOExercise.spring.entities.Person;
import com.springDTOExercise.spring.model.PersonDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {
    public Person personDTOToPerson(PersonDTO personDTO);

    public PersonDTO personToPersonDTO(Person person);
}
