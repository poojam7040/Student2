package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer rollno;
    @Column
	private String name;
    @Column
	private String mobno;
	
    //Getter And Setter Methods
    public Integer getRollno() {
		return rollno;
	}


	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobno() {
		return mobno;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	//ToString Method 
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mobno=" + mobno + "]";
	}
	
	//Parameterized constructor
	public Student( String name, String mobno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mobno = mobno;
	}
}
