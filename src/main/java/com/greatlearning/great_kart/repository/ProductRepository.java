package com.greatlearning.great_kart.repository;

import com.greatlearning.great_kart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    //Query Methods
    Optional<Product> findByName(String name);
}
