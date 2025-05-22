package com.grirzouhair.storeapi.controller;

import com.grirzouhair.storeapi.dtos.UserDtos;
import com.grirzouhair.storeapi.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping
    public Iterable<UserDtos> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserDtos(user.getId(), user.getName(), user.getEmail()))
                .toList();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDtos> getUser(@PathVariable Long id) {
    var user = userRepository.findById(id).orElse(null);
    if (user == null) {
        return ResponseEntity.notFound().build();
    }
    var userDto = new UserDtos(user.getId(), user.getName(), user.getEmail());
        return ResponseEntity.ok(userDto);
    }
}
