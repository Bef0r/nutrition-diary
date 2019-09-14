package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "Materials")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NaturalId
	private String name;
	
	private String sortname;
	
	@ManyToOne
	private MaterialGroup materialgroup;

	
	
	
	public Material(){}
	
	public Material(String name, String sortname, MaterialGroup materialgroup) {
		super();
		this.name = name;
		this.sortname = sortname;
		this.materialgroup = materialgroup;
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

	public String getSortname() {
		return sortname;
	}

	public void setSortname(String sortname) {
		this.sortname = sortname;
	}

	public MaterialGroup getMaterialgroup() {
		return materialgroup;
	}

	public void setMaterialgroup(MaterialGroup materialgroup) {
		this.materialgroup = materialgroup;
	}

	
	
	
}
