package com.healthi.family.model;

import java.util.List;

public class Person {
	
	//fields
	private String name;
	private String gender;
	private Person mother;
	private Person father;
	private List<Person> Children;
	private Person spouse;
	
	//constructors
	public Person() {
		super();
	}
	public Person(String name, String gender, Person mother, Person father, List<Person> children, Person spouse) {
		super();
		this.name = name;
		this.gender = gender;
		this.mother = mother;
		this.father = father;
		Children = children;
		this.spouse = spouse;
	}
	
	// getters and setters
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
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public List<Person> getChildren() {
		return Children;
	}
	public void setChildren(List<Person> children) {
		Children = children;
	}
	public Person getSpouse() {
		return spouse;
	}
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}
	
	//util
	public void setParents(Person f, Person m) {
		this.setFather(f);
		this.setMother(m);
	}
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", mother=" + mother + ", father=" + father + ", Children=" + Children
				+ ", spouse=" + spouse + "]";
	}
	
	
}
