package com.denizturkmen.Entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "Person_Table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // kalitimda tek tablonun gözükeceğini söylüyorsun
@DiscriminatorColumn(name = "Kayit_Ismi",discriminatorType = DiscriminatorType.STRING) //column ismini kendi veriyorsun record type die mysql gözükecek alan
@DiscriminatorValue(value = "PersonType")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Gender")
	private String gender;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
