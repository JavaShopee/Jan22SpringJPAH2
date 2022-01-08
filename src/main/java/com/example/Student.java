package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int roll;
	private String name;
	private String tech;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
}
