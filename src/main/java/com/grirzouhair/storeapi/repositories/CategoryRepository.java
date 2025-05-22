package com.grirzouhair.storeapi.repositories;

import com.grirzouhair.storeapi.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}