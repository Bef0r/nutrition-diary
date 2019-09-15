package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Dose;

@Repository
public interface DoseRepository extends JpaRepository<Dose, Integer> {

}
