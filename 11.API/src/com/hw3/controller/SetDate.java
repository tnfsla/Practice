package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class SetDate {
	public SetDate() {
		// TODO Auto-generated constructor stub
	}
	
	public String todayPrint() {
		GregorianCalendar gc = new GregorianCalendar();
	
		int date = gc.get(GregorianCalendar.DATE);
		int hour = gc.get(GregorianCalendar.HOUR);
		int minute = gc.get(GregorianCalendar.MINUTE);
		int month = (gc.get(GregorianCalendar.MONTH) + 1); 
		int second = gc.get(GregorianCalendar.SECOND);
		int year = gc.get(GregorianCalendar.YEAR);
		
		String result = year+"년 "+month+"월 "+date+"일 "+hour+"시 "+minute+"분 "+second+"초";
		
		return result;
	}
	
	public String setDay() {
		GregorianCalendar gc = new GregorianCalendar();
	
		gc.set(2011, 2, 21);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 d일 E요일");
		String result = sdf1.format(gc.getTime());
		
		return result;
	}

}
