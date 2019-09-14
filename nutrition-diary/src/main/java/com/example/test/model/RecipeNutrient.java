package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name ="Recipe_Nutrients")
public class RecipeNutrient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NaturalId
	private int recipe;
	private int nutrient;
	private int quantity;
	
	
	public RecipeNutrient() {}
	
	public RecipeNutrient(int recipe, int nutrient, int quantity) {
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
	public int getRecipeid() {
		return recipe;
	}
	public void setRecipeid(int recipe) {
		this.recipe = recipe;
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
	
	
	
}
