package com.kh.chap03_class.model.vo;

public class Person {
	//필드부
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//생성자 부
	public Person() {  //공란에 컨트롤+space 하면 바로 같은이름의 생성자 만들 수 있음
		// TODO Auto-generated constructor stub
	}
	
	//메소드부
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	public String information() {
		return id+" "+pwd+" "+name+" "+age+" "+gender+" "+phone+" "+email;
	}
	

}
