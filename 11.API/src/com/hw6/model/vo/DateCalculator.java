package com.hw6.model.vo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}

	public long leapDate() {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2021, 4, 20);
		long result = 0 ;

		for(int i = 1 ; i<gc.get(GregorianCalendar.YEAR); i++) {
			if(isLeapYear(i)) {
				result+=366;
			}else {
				result+=365;
			}
		}

		for(int i = 1; i<gc.get(GregorianCalendar.MONTH)+1; i++) {
			if(i==1 || i==3|| i==5||i==7||i==8||i==10||i==12) {
				result+=31;
			}else if(i==2) {
				if(isLeapYear(gc.get(GregorianCalendar.YEAR))) {
					result+=29;
				}else {
					result+=28;
				}
			}else {
				result+=30;
			}
		}
		
		result+=gc.get(GregorianCalendar.DATE);
				
		return result;
	}

	public boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
	}

}
