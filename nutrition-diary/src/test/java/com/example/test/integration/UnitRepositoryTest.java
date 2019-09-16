package com.example.test.integration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.model.Nutrient;
import com.example.test.model.Unit;
import com.example.test.repository.NutrientRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private NutrientRepository UnitRepository;

	@Test
	public void when_FindByName_then_return_nutrient() {
		Unit unit = new Unit("Teszt");
		entityManager.persist(unit);
		entityManager.flush();

		Nutrient foundUnit = UnitRepository.findByName(unit.getName());

		assertThat(foundUnit.getName()).isEqualTo(unit.getName());
	}
}
