package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int dose;
	
	private int recipe_group;
	
	private String preparation;

	
	public Recipe() {}
	
	public Recipe(String name, int dose, int recipe_group, String preparation) {
		super();
		this.name = name;
		this.dose = dose;
		this.recipe_group = recipe_group;
		this.preparation = preparation;
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

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

	public int getRecipe_group() {
		return recipe_group;
	}

	public void setRecipe_group(int recipe_group) {
		this.recipe_group = recipe_group;
	}

	public String getPreparation() {
		return preparation;
	}

	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}
	
	
	
	
}
