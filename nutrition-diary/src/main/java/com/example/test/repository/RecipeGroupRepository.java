package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.RecipeGroup;

@Repository
public interface RecipeGroupRepository extends JpaRepository<RecipeGroup, Integer> {

}
