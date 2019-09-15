package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="nutrients")
public class Nutrient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NaturalId
	private String name;
	
	private String abbreviation;
	
	private String unit;

	
	
	public Nutrient() {
		super();
	}

	public Nutrient(String name, String abbreviation, String unit) {
		super();
		this.name = name;
		this.abbreviation = abbreviation;
		this.unit = unit;
	}

	public Nutrient(int id, String name, String abbreviation, String unit) {
		super();
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
		this.unit = unit;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAbbreviation() {
		return abbreviation;
	}



	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}



	public String getUnit() {
		return unit;
	}



	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}
