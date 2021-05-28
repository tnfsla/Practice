package com.kh.part02.personMVC.model.vo;

public class Person {
	private String name;
	private int age;
	private int wealth;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, int wealth) {
		super();
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	public String information() {
		return "이름 : "+name+", 나이 : "+age+", 재산 : "+wealth;
	}

}
