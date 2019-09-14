package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "Ingrediments")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NaturalId
	private String name;
	
	private String sortname;
	
	private int materialgroupid;

	
	
	
	public Material(){}
	
	public Material(String name, String sortname, int materialgroupid) {
		super();
		this.name = name;
		this.sortname = sortname;
		this.materialgroupid = materialgroupid;
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

	public int getMaterialgroupid() {
		return materialgroupid;
	}

	public void setMaterialgroupid(int materialgroupid) {
		this.materialgroupid = materialgroupid;
	}
	
	
	
}
