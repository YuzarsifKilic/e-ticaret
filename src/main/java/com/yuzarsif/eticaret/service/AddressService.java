package com.yuzarsif.eticaret.service;

import com.yuzarsif.eticaret.dto.converter.AddressDtoConverter;
import com.yuzarsif.eticaret.dto.model.AddressDto;
import com.yuzarsif.eticaret.dto.model.UserAddressDto;
import com.yuzarsif.eticaret.exception.AddressNotFoundException;
import com.yuzarsif.eticaret.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AddressService {

    private final AddressRepository addressRepository;
    private final AddressDtoConverter converter;

    public AddressService(AddressRepository addressRepository, AddressDtoConverter converter) {
        this.addressRepository = addressRepository;
        this.converter = converter;
    }

    public List<AddressDto> getAll() {
        return addressRepository.findAll().stream().map(converter::convert).collect(Collectors.toList());
    }

    public UserAddressDto findById(int id) {
        return converter.convertUserAddressDto(addressRepository
                .findById(id)
                .orElseThrow(
                        () -> new AddressNotFoundException(id + " ye sahip adres bulunamadı")));
    }

    public List<UserAddressDto> getAddressesByUser(String userId) {
        return addressRepository
                .findAll()
                .stream()
                .filter(
                        a -> Objects.equals(a.getUser().getId(), userId))
                .map(converter::convertUserAddressDto)
                .collect(Collectors.toList());
    }
}
