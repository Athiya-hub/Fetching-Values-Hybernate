package com.athiya.hyb1.hybernateprojectexample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pojo {

	@Id
	private int rollno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	@Override
	public String toString() {
		return "Pojo [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}
