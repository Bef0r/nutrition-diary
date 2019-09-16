package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ingrediments")
public class Ingrediment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Recipe recipe;
	
	@ManyToOne
	private Material material;
	
	private double quantity;
	
	@ManyToOne
	private Unit unit;

	
	
	public Ingrediment() {
	
	}

	public Ingrediment(Recipe recipe, Material material, double quantity, Unit unit) {
		super();
		this.recipe = recipe;
		this.material = material;
		this.quantity = quantity;
		this.unit = unit;
	}


	public Ingrediment(int id, Recipe recipe, Material material, int quantity, Unit unit) {
		super();
		this.id = id;
		this.recipe = recipe;
		this.material = material;
		this.quantity = quantity;
		this.unit = unit;
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



	public Material getMaterial() {
		return material;
	}



	public void setMaterial(Material material) {
		this.material = material;
	}



	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}



	public Unit getUnit() {
		return unit;
	}



	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	
	
}
