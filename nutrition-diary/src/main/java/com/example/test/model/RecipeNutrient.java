package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name ="recipe_nutrients")
public class RecipeNutrient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Recipe recipe;
	
	private double quantity;
	
	@ManyToOne
	private Nutrient nutrients;
	
	
	

	public RecipeNutrient() {}

	public RecipeNutrient(Recipe recipe, double quantity, Nutrient nutrients) {
		super();
		this.recipe = recipe;
		this.quantity = quantity;
		this.nutrients = nutrients;
	}

	public RecipeNutrient(int id, Recipe recipe, double quantity, Nutrient nutrients) {
		super();
		this.id = id;
		this.recipe = recipe;
		this.quantity = quantity;
		this.nutrients = nutrients;
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Nutrient getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrient nutrients) {
		this.nutrients = nutrients;
	}	
}
