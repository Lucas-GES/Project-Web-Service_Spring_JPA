package com.course.projetowebservice_Spring_JPA.repositories;

import com.course.projetowebservice_Spring_JPA.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
