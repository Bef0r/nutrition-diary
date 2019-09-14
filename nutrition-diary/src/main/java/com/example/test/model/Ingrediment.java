package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "Ingrediments")
public class Ingrediment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NaturalId
	@ManyToOne
	private Recipe recipe;
	
	private int material;
	
	private int quantity;
	
	@ManyToOne
	private Unit unit;

	
	
	public Ingrediment() {
	
	}
	
	public Ingrediment(Recipe recipe, int material, int quantity, Unit unit) {
		super();
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

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	
	
}
