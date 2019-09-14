package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;


@Entity
@Table(name="Recipes")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NaturalId
	private String name;
	
	@ManyToOne
	private RecipeGroup recipe_group;
	
	private String preparation;

	@ManyToOne
	private Dose dose;

	
	
	
	private Recipe() {}
	
	

	public Recipe(String name, RecipeGroup recipe_group, String preparation) {
		super();
		this.name = name;
		this.recipe_group = recipe_group;
		this.preparation = preparation;
	}
	
	

	public Recipe(int id, String name, RecipeGroup recipe_group, String preparation, Dose dose) {
		super();
		this.id = id;
		this.name = name;
		this.recipe_group = recipe_group;
		this.preparation = preparation;
		this.dose = dose;
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



	public RecipeGroup getRecipe_group() {
		return recipe_group;
	}



	public void setRecipe_group(RecipeGroup recipe_group) {
		this.recipe_group = recipe_group;
	}



	public String getPreparation() {
		return preparation;
	}



	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}



	public Dose getDose() {
		return dose;
	}



	public void setDose(Dose dose) {
		this.dose = dose;
	}



	
	
	
}
