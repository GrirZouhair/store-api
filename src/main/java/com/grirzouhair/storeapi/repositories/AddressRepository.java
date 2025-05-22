package com.grirzouhair.storeapi.repositories;

import com.grirzouhair.storeapi.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}