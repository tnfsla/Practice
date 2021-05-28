package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] a = new Animal[5];
		a[0] = new Cat("야옹이","고양이종 1","사막","노란색");
		a[1] = new Dog("멍멍이","강아지종 1",10);
		a[2] = new Dog("초코","강아지종2",5);
		a[3] = new Cat("철수","고양이종 2","자취방","갈색");
		a[4] = new Dog("영희","강아지종3",7);
		
		for(int i =0; i<a.length ; i++) {
			a[i].speak();
		}

	}

}
