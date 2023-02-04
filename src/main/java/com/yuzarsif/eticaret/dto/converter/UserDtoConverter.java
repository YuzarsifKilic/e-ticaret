package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.UserDto;
import com.yuzarsif.eticaret.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {

    public UserDto converter(User from) {
        return new UserDto(
                from.getId(),
                from.getEmail());
    }
}
