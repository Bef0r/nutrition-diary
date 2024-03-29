package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.MaterialNutrient;

@Repository
public interface MaterialNutrientRepository extends JpaRepository<MaterialNutrient, Integer> {

}
