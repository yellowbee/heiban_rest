package com.heiban.rest.domain;

public class Course {
	private String name;
	private String population;
	
	public Course(String name, String population) {
		this.name = name;
		this.population = population;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}

}
