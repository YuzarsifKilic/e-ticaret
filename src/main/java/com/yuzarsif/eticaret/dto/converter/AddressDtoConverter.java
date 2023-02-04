package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.AddressDto;
import com.yuzarsif.eticaret.dto.model.UserAddressDto;
import com.yuzarsif.eticaret.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressDtoConverter {

    private final UserDtoConverter converter;

    public AddressDtoConverter(UserDtoConverter converter) {
        this.converter = converter;
    }

    public AddressDto convert(Address from) {
        return new AddressDto(
                from.getId(),
                from.getApartmentNo(),
                from.getFlat(),
                from.getStreet(),
                from.getProvince(),
                from.getDistrict(),
                from.getCountry(),
                converter.converter(from.getUser()));
    }

    public UserAddressDto convertUserAddressDto(Address from) {
        return new UserAddressDto(
                from.getId(),
                from.getApartmentNo(),
                from.getFlat(),
                from.getStreet(),
                from.getProvince(),
                from.getDistrict(),
                from.getCountry());
    }
}
