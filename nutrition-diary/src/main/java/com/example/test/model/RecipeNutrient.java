package com.example.test.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name ="Recipe_Nutrients")
public class RecipeNutrient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NaturalId
	@ManyToOne
	private Recipe recipe;
	
	private int nutrient;
	
	private int quantity;
	
	@OneToMany
	private List<Nutrient> nutrients;
	
	public RecipeNutrient() {}
	
	public RecipeNutrient(Recipe recipe, int nutrient, int quantity) {
		super();
		this.recipe = recipe;
		this.nutrient = nutrient;
		this.quantity = quantity;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNutrient() {
		return nutrient;
	}
	public void setNutrient(int nutrient) {
		this.nutrient = nutrient;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public List<Nutrient> getNutrients() {
		return nutrients;
	}

	public void setNutrients(List<Nutrient> nutrients) {
		this.nutrients = nutrients;
	}
	
	
	
}
