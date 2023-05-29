package com.Hibernate.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Emp {
@Id	
private int id;
private String name;

@OneToOne
@JoinColumn(name="p_id")
private Project pro;

public Project getPro() {
	return pro;
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
public void setPro(Project p) {
	// TODO Auto-generated method stub
	this.pro=p;
	
}



}
