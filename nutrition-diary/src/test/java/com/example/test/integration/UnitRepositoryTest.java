package com.example.test.integration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.model.Unit;
import com.example.test.repository.UnitRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private UnitRepository unitRepository;

	@Test
	public void when_FindByName_then_return_unit() {
		Unit unit = new Unit("Teszt");
		entityManager.persist(unit);
		entityManager.flush();

		Unit foundUnit = unitRepository.findByName(unit.getName());

		assertThat(foundUnit.getName()).isEqualTo(unit.getName());
	}
}
