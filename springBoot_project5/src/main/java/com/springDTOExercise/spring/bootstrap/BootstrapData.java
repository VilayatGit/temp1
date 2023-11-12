package com.springDTOExercise.spring.bootstrap;

import com.springDTOExercise.spring.entities.Person;
import com.springDTOExercise.spring.repositories.PersonRepository;
import com.springDTOExercise.spring.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final PersonService personService;
    private final PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        loadPersonData();
    }

    public void loadPersonData(){
        if (personRepository.count() == 0){
            Person person1 = Person.builder()
                .name("John")
                .surname("Fisher")
                .build();

        Person person2 = Person.builder()
                .name("Jacob")
                .surname("White")
                .build();

        Person person3 = Person.builder()
                .name("Anna")
                .surname("White")
                .build();

        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
        }
    }
}
