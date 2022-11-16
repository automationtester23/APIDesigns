package com.api.example.rest.Models;

import javax.persistence.*;

//below entity annontation tells mysql that this user class will be a table within the database
@Entity
public class User {
	//below id and generatedvalue annotation tells mysql that id will be unique for each user
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//below column annotation will tell mysql that they will be column in database
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int age;
	@Column
	private String occupation;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


}
