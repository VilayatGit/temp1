package com.springDTOExercise.spring.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class PersonDTO {
    private Long id;
    private Integer version;
    private String name;
    private String surname;
}
