package com.course.projetowebservice_spring_jpa.repositories;

import com.course.projetowebservice_spring_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
