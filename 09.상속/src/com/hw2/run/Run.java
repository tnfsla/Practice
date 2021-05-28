package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c = new Circle[2];
		Rectangle[] r = new Rectangle[2];
		
		c[0]= new Circle(1,2,3);
		c[1]= new Circle(3,3,4);
		r[0]= new Rectangle(-1,-2,5,2);
		r[2]= new Rectangle(-2,5,2,8);
		
		System.out.println("====circle====");
		for(Circle ci : c) {
			ci.draw();
		}
		System.out.println("====rectangle====");
		for(Rectangle re : r) {
			re.draw();
		}

	}

}
