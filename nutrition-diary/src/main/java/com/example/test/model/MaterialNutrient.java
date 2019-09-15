package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "material_nutrients")
public class MaterialNutrient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Material material;
	
	@ManyToOne
	private Nutrient nutrient;
	
	private int quantity;

	
	
	
	public MaterialNutrient() {
		super();
	}
	
	public MaterialNutrient(Material material) {
		super();
		this.material = material;
	}
	
	
	public MaterialNutrient(int id, Material material, Nutrient nutrient, int quantity) {
		super();
		this.id = id;
		this.material = material;
		this.nutrient = nutrient;
		this.quantity = quantity;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Nutrient getNutrient() {
		return nutrient;
	}

	public void setNutrient(Nutrient nutrient) {
		this.nutrient = nutrient;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
