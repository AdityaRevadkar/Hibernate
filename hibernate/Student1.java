package com.Hibernate.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {
@Id	
private int roll;
private String name;

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
public Student1() {
	super();
	// TODO Auto-generated constructor stub
}
public Student1(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}



}
