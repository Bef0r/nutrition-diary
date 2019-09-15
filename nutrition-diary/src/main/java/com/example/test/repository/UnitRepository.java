package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.model.Unit;

public interface UnitRepository extends JpaRepository<Unit, Integer> {

}
