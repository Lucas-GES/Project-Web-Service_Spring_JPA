package com.course.projetowebservice_Spring_JPA.repositories;

import com.course.projetowebservice_Spring_JPA.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
