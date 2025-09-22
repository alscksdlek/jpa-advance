package com.sparta.jpa_advance.repository;

import com.sparta.jpa_advance.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
