package com.grirzouhair.storeapi.repositories;

import com.grirzouhair.storeapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
//    Iterable<Long> id(Long id);
}
