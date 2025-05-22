package com.grirzouhair.storeapi.repositories;

import com.grirzouhair.storeapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}