package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Material;
import com.example.test.model.Unit;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {
	public Material findByName(String name);
}
