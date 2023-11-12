package com.springbootlombok.spring.mappers;

import com.springbootlombok.spring.entities.Beer;
import com.springbootlombok.spring.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
