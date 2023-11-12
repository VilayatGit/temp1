package com.springbootlombok.spring.mappers;

import com.springbootlombok.spring.entities.Customer;
import com.springbootlombok.spring.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
