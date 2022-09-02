package com.Mindtree.Patient.Entity;






import javax.persistence.Entity;

import javax.persistence.Id;



@Entity
public class Patient {
	
	@Id
	private	int id;
	
	private	String name;
	
	private	int age;
	
	private	String dateOfVisit;
	
	private	String prescription;
	
	
	private	int did;
	

	public Patient() {
		super();
	
	}


	public Patient(int id, String name,int age, String dateOfVisit, String prescription, int did) {
		super();
		this.id = id;
		this.age=age;
		this.name = name;
		this.dateOfVisit = dateOfVisit;
		this.prescription = prescription;
		this.did = did;
	}

	
	public Patient( String name,int age, String dateOfVisit, String prescription) {
		super();
		
		this.name = name;
		this.age=age;

		this.dateOfVisit = dateOfVisit;
		this.prescription = prescription;
		
	}
	public Patient(int id, String name, String dateOfVisit, String prescription) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfVisit = dateOfVisit;
		this.prescription = prescription;
		
	}
	public Patient(int id, String name,int age, String dateOfVisit,  int did) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
		this.dateOfVisit = dateOfVisit;
		
		this.did = did;
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


	public String getDateOfVisit() {
		return dateOfVisit;
	}


	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}


	public String getPrescription() {
		return prescription;
	}


	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", dateOfVisit=" + dateOfVisit
				+ ", prescription=" + prescription + ", did=" + did + "]";
	}


	
	
	

}
