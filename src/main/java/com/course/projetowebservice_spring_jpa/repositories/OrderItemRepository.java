package com.course.projetowebservice_spring_jpa.repositories;


import com.course.projetowebservice_spring_jpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
