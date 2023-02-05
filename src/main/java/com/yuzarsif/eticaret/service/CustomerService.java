package com.yuzarsif.eticaret.service;

import com.yuzarsif.eticaret.dto.converter.CustomerDtoConverter;
import com.yuzarsif.eticaret.dto.model.CustomerDto;
import com.yuzarsif.eticaret.dto.request.CreateCustomerRequest;
import com.yuzarsif.eticaret.exception.CustomerNotFoundException;
import com.yuzarsif.eticaret.model.Customer;
import com.yuzarsif.eticaret.model.User;
import com.yuzarsif.eticaret.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final UserService userService;
    private final CustomerDtoConverter converter;

    public CustomerService(CustomerRepository customerRepository, UserService userService, CustomerDtoConverter converter) {
        this.customerRepository = customerRepository;
        this.userService = userService;
        this.converter = converter;
    }

    public Customer createCustomer(CreateCustomerRequest request) {
        User user = userService.findById(request.getUserId());
        Customer customer = new Customer(user.getId(), user.getEmail(), user.getPassword(), true, request.getFirstName(), request.getLastName());
        return customerRepository.save(customer);
    }

    protected Customer findById(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException(id + " ye sahip bic customer bulunamadı"));
    }

    public CustomerDto getById(String id) {
        return converter.convert(findById(id));
    }

    public List<CustomerDto> getAllCustomer() {
        return converter.convert(customerRepository.findAll());
    }


}
