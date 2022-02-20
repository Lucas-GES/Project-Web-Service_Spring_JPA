package com.course.projetowebservice_spring_jpa.repositories;

import com.course.projetowebservice_spring_jpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
