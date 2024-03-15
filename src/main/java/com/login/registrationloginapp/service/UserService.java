package com.login.registrationloginapp.service;

import com.login.registrationloginapp.dto.UserDto;
import com.login.registrationloginapp.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
