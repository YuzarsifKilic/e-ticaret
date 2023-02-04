package com.yuzarsif.eticaret.service;

import com.yuzarsif.eticaret.dto.converter.UserDtoConverter;
import com.yuzarsif.eticaret.dto.model.UserDto;
import com.yuzarsif.eticaret.dto.request.CreateUserRequest;
import com.yuzarsif.eticaret.exception.UserNotFoundException;
import com.yuzarsif.eticaret.model.User;
import com.yuzarsif.eticaret.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserDtoConverter userDtoConverter;

    public UserService(UserRepository userRepository, UserDtoConverter userDtoConverter) {
        this.userRepository = userRepository;
        this.userDtoConverter = userDtoConverter;
    }

    public UserDto createUser(CreateUserRequest request) {
        User user = new User(request.getEmail(), request.getPassword(), false);
        return userDtoConverter.converter(userRepository.save(user));
    }

    protected User findById(String id) {
        return userRepository
                .findById(id)
                .orElseThrow(
                        () -> new UserNotFoundException(id + " ye sahip bir user bulunamadı"));
    }
}
