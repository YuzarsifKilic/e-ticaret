package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.CompanyDto;
import com.yuzarsif.eticaret.model.Company;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CompanyDtoConverter {

    private final TelNoDtoConverter telNoDtoConverter;
    private final AddressDtoConverter addressDtoConverter;

    public CompanyDtoConverter(TelNoDtoConverter telNoDtoConverter, AddressDtoConverter addressDtoConverter) {
        this.telNoDtoConverter = telNoDtoConverter;
        this.addressDtoConverter = addressDtoConverter;
    }

    public CompanyDto convert(Company from) {
        return new CompanyDto(
                from.getId(),
                from.getEmail(),
                from.getCompanyName(),
                from.getWebSite(),
                from.getTelNumbers()
                        .stream()
                        .map(telNoDtoConverter::convert)
                        .collect(Collectors.toSet()),
                from.getAddresses()
                        .stream()
                        .map(addressDtoConverter::convertUserAddressDto)
                        .collect(Collectors.toSet()));
    }
}
