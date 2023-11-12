package com.springDTOExercise.spring.services;

import com.springDTOExercise.spring.entities.Person;
import com.springDTOExercise.spring.mappers.PersonMapper;
import com.springDTOExercise.spring.model.PersonDTO;
import com.springDTOExercise.spring.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PersonServiceJPA implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    @Override
    public List<PersonDTO> listPersons() {
        return personRepository.findAll()
                .stream()
                .map(personMapper::personToPersonDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<PersonDTO> getPersonById(Long id) {
        return Optional.ofNullable(personMapper.personToPersonDTO(personRepository.findById(id).orElse(null)));
    }

    @Override
    public PersonDTO saveNewPerson(PersonDTO personDTO) {
        return personMapper.personToPersonDTO(personRepository.save(personMapper.personDTOToPerson(personDTO)));
    }

    @Override
    public Boolean deletePersonById(Long id) {
        if(personRepository.existsById(id)){
            personRepository.deleteById(id);
            return true;
        }else{
            return false;}
    }

    @Override
    public Optional<PersonDTO> updatePerson(Long id, PersonDTO personDTO) {
            Optional<Person> optionalPerson = personRepository.findById(id);

            if (optionalPerson.isPresent()){
                Person existingPerson = optionalPerson.get();
                existingPerson.setName(personDTO.getName());
                existingPerson.setSurname(personDTO.getSurname());

                Person updatedPerson = personRepository.save(existingPerson);
                Optional<PersonDTO> updatedPersonDto = Optional.of(personMapper.personToPersonDTO(existingPerson));
                return updatedPersonDto;
            }else {
                return Optional.empty();
            }
    }
}
