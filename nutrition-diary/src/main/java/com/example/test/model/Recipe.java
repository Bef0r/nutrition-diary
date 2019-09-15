package com.example.test.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;


@Entity
@Table(name="recipes")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NaturalId
	private String name;
	
	@ManyToOne
	private RecipeGroup recipegroup;
	
	@Column(length=2000 )
	private String preparation;

	@ManyToOne
	private Dose dose;

	@OneToMany
	private List<RecipeNutrient> nutrients;
	
	@OneToMany
	private List<Ingrediment> ingrediments;

	

	public Recipe() {}

	public Recipe(String name, RecipeGroup recipegroup, String preparation, Dose dose, List<RecipeNutrient> nutrients,
			List<Ingrediment> ingrediments) {
		super();
		this.name = name;
		this.recipegroup = recipegroup;
		this.preparation = preparation;
		this.dose = dose;
		this.nutrients = nutrients;
		this.ingrediments = ingrediments;
	}
	
	
	public Recipe(int id, String name, RecipeGroup recipegroup, String preparation, Dose dose,
			List<RecipeNutrient> nutrients, List<Ingrediment> ingrediments) {
		super();
		this.id = id;
		this.name = name;
		this.recipegroup = recipegroup;
		this.preparation = preparation;
		this.dose = dose;
		this.nutrients = nutrients;
		this.ingrediments = ingrediments;
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
	
	
	public RecipeGroup getRecipegroup() {
		return recipegroup;
	}

	
	public void setRecipegroup(RecipeGroup recipegroup) {
		this.recipegroup = recipegroup;
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



	public List<RecipeNutrient> getNutrients() {
		return nutrients;
	}



	public void setNutrients(List<RecipeNutrient> nutrients) {
		this.nutrients = nutrients;
	}



	public List<Ingrediment> getIngrediments() {
		return ingrediments;
	}



	public void setIngrediments(List<Ingrediment> ingrediments) {
		this.ingrediments = ingrediments;
	}
}
