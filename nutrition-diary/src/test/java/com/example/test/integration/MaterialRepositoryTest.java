package com.example.test.integration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.model.Material;
import com.example.test.model.MaterialGroup;
import com.example.test.repository.MaterialRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class MaterialRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private MaterialRepository materialRepository;

	@Test
	public void when_FindByName_then_return_material() {
		MaterialGroup materialGroup = new MaterialGroup("TESZT GROUP");
		Material material = new Material("Teszt","TESZT SORTNAME", materialGroup);
		
		entityManager.persist(materialGroup);
		entityManager.persist(material);
		entityManager.flush();

		Material foundMaterial = materialRepository.findByName(material.getName());

		assertThat(foundMaterial.getName()).isEqualTo(material.getName());
	}
}
