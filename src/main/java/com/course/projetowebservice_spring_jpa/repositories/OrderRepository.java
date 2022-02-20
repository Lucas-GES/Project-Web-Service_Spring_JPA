package com.course.projetowebservice_spring_jpa.repositories;

import com.course.projetowebservice_spring_jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
