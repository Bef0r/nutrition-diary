package com.example.test.integration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.model.Dose;
import com.example.test.model.Recipe;
import com.example.test.model.RecipeGroup;
import com.example.test.repository.RecipeRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RecipeRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private RecipeRepository recipeRepository;

	@Test
	public void when_FindByName_then_return_recipe() {
		
		RecipeGroup recipegroup = new RecipeGroup("TESZT RECIPEGROUP");
		Dose dose = new Dose ("TESZT DOSE");
		
		Recipe recipe = new Recipe("Teszt",recipegroup,"TESZT Preparation",dose);
		entityManager.persist(recipe);
		entityManager.flush();

		Recipe foundrecipe = recipeRepository.findByName(recipe.getName());

		assertThat(foundrecipe.getName()).isEqualTo(recipe.getName());
	}
}
