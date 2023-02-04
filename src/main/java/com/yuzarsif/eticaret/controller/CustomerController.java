package com.yuzarsif.eticaret.controller;

import com.yuzarsif.eticaret.dto.model.CustomerDto;
import com.yuzarsif.eticaret.dto.request.CreateCustomerRequest;
import com.yuzarsif.eticaret.model.Customer;
import com.yuzarsif.eticaret.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    public Customer save(@RequestBody CreateCustomerRequest request) {
        return customerService.createCustomer(request);
    }

    @GetMapping("getall")
    public List<CustomerDto> getAll() {
        return customerService.getAllCustomer();
    }

}
