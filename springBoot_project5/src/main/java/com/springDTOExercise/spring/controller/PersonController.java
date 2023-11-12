package com.springDTOExercise.spring.controller;

import com.springDTOExercise.spring.model.PersonDTO;
import com.springDTOExercise.spring.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PersonController {
    public static final String PERSON_PATH = "/api/v1/person";
    public static final String PERSON_PATH_ID = PERSON_PATH + "/{personId}";

    private final PersonService personService;

    @GetMapping(value = PERSON_PATH)
    public List<PersonDTO> personList(){
        return personService.listPersons();
    }

    @GetMapping(value = PERSON_PATH_ID)
    public PersonDTO getPersonById(@PathVariable("personId")Long id){
        return personService.getPersonById(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping(value = PERSON_PATH)
    public ResponseEntity saveNewPerson(@RequestBody PersonDTO personDTO){
        PersonDTO savedPerson = personService.saveNewPerson(personDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location",PERSON_PATH + "/" + savedPerson.getId().toString());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping(value = PERSON_PATH_ID)
    public ResponseEntity updatePersonById(@PathVariable("personId")Long id,@RequestBody PersonDTO personDTO){
        personService.updatePerson(id, personDTO);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = PERSON_PATH_ID)
    public ResponseEntity deletePersonById(@PathVariable("personId")Long id){
        personService.deletePersonById(id);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
