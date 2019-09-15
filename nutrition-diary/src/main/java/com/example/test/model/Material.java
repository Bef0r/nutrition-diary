package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "materials")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NaturalId
	private String name;
	
	private String sortName;
	
	@ManyToOne
	private MaterialGroup materialGroup;

	
	
	
	public Material(){}
	
	public Material(String name, String sortName, MaterialGroup materialGroup) {
		super();
		this.name = name;
		this.sortName = sortName;
		this.materialGroup = materialGroup;
	}
	
	public Material(int id, String name, String sortName, MaterialGroup materialGroup) {
		super();
		this.id = id;
		this.name = name;
		this.sortName = sortName;
		this.materialGroup = materialGroup;
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




	public String getSortName() {
		return sortName;
	}




	public void setSortName(String sortName) {
		this.sortName = sortName;
	}




	public MaterialGroup getMaterialGroup() {
		return materialGroup;
	}




	public void setMaterialGroup(MaterialGroup materialGroup) {
		this.materialGroup = materialGroup;
	}
	
	
}
