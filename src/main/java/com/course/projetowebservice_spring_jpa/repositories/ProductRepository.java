package com.course.projetowebservice_spring_jpa.repositories;

import com.course.projetowebservice_spring_jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
