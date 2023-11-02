package com.project.blogappapis.Services;

import com.project.blogappapis.Payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto registerNewUser(UserDto userDto);

    // Create
    UserDto createUser(UserDto userDto);

    // Update
    UserDto updateUser(UserDto userDto, Integer userId);

    // Get
    UserDto getUserById(Integer id);

    // Get all
    List<UserDto> getAllUsers();

    // Delete
    void deleteUser(Integer userId);

}
