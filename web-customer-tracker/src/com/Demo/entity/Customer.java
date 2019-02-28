package com.Demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	/*@GeneratedValue(strategy=GenerationType.IDENTITY)*/
	@Column(name="ID")
	private int id;
	
	@Column(name="FNAME")
	private String fname;
	
	@Column(name="LNAME")
	private String lname;

	@Column(name="EMAIL")
	private String email;
	
	public Customer()
	{
		
	}

	public Customer(int id, String fname, String lname, String email) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	
	
	
}
