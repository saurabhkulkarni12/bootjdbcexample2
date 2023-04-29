package com.jdbc.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class Employee {
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private int age;
	private String gender;
	
	public Employee(int id, String first_name, String last_name, String email, String phone_number, int age,
			String gender) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.age = age;
		this.gender = gender;
	}
	
	public Employee() {
		this(0, "", "", "","",0, "");
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return String.format("Employee [%s, %s, %s, %s, %s, %s, %s]", id, first_name, last_name, email,
				phone_number,age,gender);

	}
	
	
}
