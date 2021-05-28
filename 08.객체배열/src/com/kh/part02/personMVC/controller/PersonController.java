package com.kh.part02.personMVC.controller;

import com.kh.part02.personMVC.model.vo.Person;

public class PersonController {
	private Person[] people = new Person[3]; //3명의 회원정보를 관리하기 위한 객체배열
	private int count = 0; //사람 수 카운트
	
	//person 객체 생성하는 method
	public boolean insertPerson(String name, int age, int wealth) {
		if(count<people.length) {
			people[count++] = new Person(name, age, wealth);
			return true;
		}else {
			
			return false;
		}
		
		
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public Person[] getPeople() {
		// TODO Auto-generated method stub
		return people;
	}

	//전달받은 검색어로 검색된 회원객체를 반환해주는 메소드, 검색된 회원이 없는경우 null 반환
	public Person searchPerson(String search) {
		// TODO Auto-generated method stub
		for(int i =0 ; i<count ; i++) {
			if(people[i].getName().equals(search)){
				return people[i];
			}
		}
		return null;
	}

	public String avgWealth() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i =0; i<count; i++) {
			sum += people[i].getWealth();
		}
		double avg = (double)sum/3;
		String avg1 = String.format("%.3f", avg);
		String avg2 = String.format("%.2f", avg);
		return String.valueOf(avg)+"\n%.3f : "+avg1 + "\n%.2f : "+avg2 ;
		//String.valueOf() -> 매개변수에 들어온 값을 String형으로 변환
	}

}
