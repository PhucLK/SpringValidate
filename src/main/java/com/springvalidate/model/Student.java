package com.springvalidate.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@NotBlank(message = "input all infor")
	private String age;

	@Size(min = 3, max = 7)
	private String name;

	@NotBlank(message = "input all infor")
	private String address;

	public Student() {
		super();
	}



	public Student(String age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	
}
