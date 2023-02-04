package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.CustomerDto;
import com.yuzarsif.eticaret.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerDtoConverter {

    private final TelNoDtoConverter telNoDtoConverter;
    private final AddressDtoConverter addressDtoConverter;

    public CustomerDtoConverter(TelNoDtoConverter telNoDtoConverter, AddressDtoConverter addressDtoConverter) {
        this.telNoDtoConverter = telNoDtoConverter;
        this.addressDtoConverter = addressDtoConverter;
    }


    public CustomerDto convert(Customer from) {
        return new CustomerDto(
                from.getId(),
                from.getEmail(),
                from.getFirstName(),
                from.getLastName(),
                from.getTelNumbers()
                        .stream()
                        .map(telNoDtoConverter::convert)
                        .collect(Collectors.toSet()),
                from.getAddresses()
                        .stream()
                        .map(addressDtoConverter::convertUserAddressDto)
                        .collect(Collectors.toSet()));
    }

    public List<CustomerDto> convert(List<Customer> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
