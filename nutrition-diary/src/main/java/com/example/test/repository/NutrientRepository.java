package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Nutrient;

@Repository
public interface NutrientRepository extends JpaRepository<Nutrient, Integer> {
	
	public Nutrient findByName(String name);
}
