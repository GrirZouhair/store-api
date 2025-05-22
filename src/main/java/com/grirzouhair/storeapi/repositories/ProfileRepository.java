package com.grirzouhair.storeapi.repositories;

import com.grirzouhair.storeapi.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}