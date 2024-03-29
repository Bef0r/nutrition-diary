package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
	Recipe findByName(String name);
}
