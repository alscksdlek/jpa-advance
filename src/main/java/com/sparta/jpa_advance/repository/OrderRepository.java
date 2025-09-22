package com.sparta.jpa_advance.repository;

import com.sparta.jpa_advance.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
