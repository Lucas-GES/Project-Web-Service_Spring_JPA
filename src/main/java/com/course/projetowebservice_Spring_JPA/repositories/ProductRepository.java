package com.course.projetowebservice_Spring_JPA.repositories;

import com.course.projetowebservice_Spring_JPA.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
