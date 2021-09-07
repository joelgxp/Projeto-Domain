package com.devj.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devj.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
