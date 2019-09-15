package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.MaterialGroup;

@Repository
public interface MaterialGroupRepository extends JpaRepository<MaterialGroup, Integer> {

}