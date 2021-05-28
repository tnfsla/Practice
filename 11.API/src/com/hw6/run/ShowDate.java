package com.hw6.run;

import java.util.Calendar;

import com.hw6.model.vo.DateCalculator;

public class ShowDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateCalculator totalDay = new DateCalculator();
		if(totalDay.isLeapYear(2021)) {
			System.out.println("올해는 윤년입니다.");
		}else {
			System.out.println("올해는 평년입니다.");
		}
		
		System.out.println(totalDay.leapDate());
		
		
		

	}

}
