package com.course.projetowebservice_Spring_JPA.repositories;

import com.course.projetowebservice_Spring_JPA.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
