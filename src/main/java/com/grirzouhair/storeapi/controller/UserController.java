package com.grirzouhair.storeapi.controller;

import com.grirzouhair.storeapi.dtos.UserDtos;
import com.grirzouhair.storeapi.mappers.UserMapper;
import com.grirzouhair.storeapi.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserController(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }
    @GetMapping
    public Iterable<UserDtos> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .toList();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDtos> getUser(@PathVariable Long id) {
    var user = userRepository.findById(id).orElse(null);
    if (user == null) {
        return ResponseEntity.notFound().build();
    }
        return ResponseEntity.ok(userMapper.toDto(user));
    }
}
