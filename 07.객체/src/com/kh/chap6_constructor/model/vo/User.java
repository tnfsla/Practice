package com.kh.chap6_constructor.model.vo;

public class User {
	/*
	 * * 생성자 : 다른 패키지나 사용하고자하는 클래스에서 현재클래스를 통한 객체를 생성할때 사용하는 메소드
	 * 
	 * [접근제한자] 클래스명([매개변수, 매개변수, ...]) {... }
	 * 접근제한자 :public (다른클래스에서 생성하려는 목적이므로)
	 * 
	 * * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 2. 매개변수로 전달받은 값들을 필드에 바로 초기화할 목적
	 * 
	 * * 생성자 작성시 주의사항
	 * 1. 반드시 클래스명과 동일해야된다. (대/소문자 구분)
	 * 2. 반환형이 존재하지 않는다. (메소드와 유사해서 헷갈릴수있음)
	 * 3. 매개변수 생성자를 명시적으로 작성하게되면 기본생성자를 JVM이 자동으로 만들어주지 않는다. 
	 *    즉, 기본생성자는 항상 기본으로 작성하는 습관을 길러라
	 * 
	 */
	//필드
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//기본생성자 -> public 클래스명(){} , 매개변수가 없는 생성자
	public User() {
		// TODO Auto-generated constructor stub
		//단지 객체생성을 목적으로 할때 사용
		//기본생성자를 생략하는 경우는 오류가 아니다-> JVM이 자동으로 만들어 줌
		//매개변수가 있는 생성자가 있는 경우 기본생성자를 필히 만들어야함
	}
	
	//매개변수가 있는 생성자
	//첫줄은 this.필드 변수명 = 매개변수명으로 초기화 해주고 시작해야함
	//객체생성과 동시에 전달된 값들을 매개변수로 받아 해당 필드에 초기화하는 목적
	public User(String userId, String userPwd,String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
//		나머지 필드부분은 JVM의 초기값으로 들어가있다.(age, gender)
	}
	public User(String userId, String userPwd,String userName,int age, char gender) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId,userPwd,userName); 
//		위에서 중복되는 초기화 하는 내용의 생성자가 존재하는 경우 this()생성자를 사용가능하다 ************
//		같은 클래스 내에서는 생성자에서 다른 생성자를 호출 가능. 단, 반드시 첫줄에 작성해야하고, 1번만 호출 가능하다
		this.age = age;
		this.gender = gender;
	}
	/*
	 * 오버로딩 ::동일한 메소드 명을 사용하면서 매개변수의 자료형 순서나 갯수가 다른경우를 오버로딩****위의 경우이다****
	 * 접근제어자, 반환형은 상관이 없다.
	 */
	
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return userId+"  "+userPwd+"  "+userName+"  "+age+"  "+gender;
	}
	


}
