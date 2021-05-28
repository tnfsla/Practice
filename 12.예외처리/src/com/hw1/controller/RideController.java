package com.hw1.controller;

import com.hw1.model.vo.Guests;
import com.hw1.model.vo.RollerCoaster;

public class RideController {
	
	public RideController() {
		// TODO Auto-generated constructor stub
	}
	public void cutGuest() {
		Guests[] gs = new Guests[4];
		gs[0]=new Guests("홍길동",17,'M',120.2);
		gs[1]=new Guests("유관순",20,'F',102.3);
		gs[2]=new Guests("김유신",23,'M',110.4);
		gs[3]=new Guests("김흥부",21,'M',112.5);
		
		RollerCoaster rc = new RollerCoaster();
		Guests[] onBoard = new Guests[rc.PERMITNUMBER];
		int cnt = 0;
		try {
			for(int i =0 ; i<gs.length; i++) {
				if(gs[i].getHeight()>rc.CUTHEIGHT)
					onBoard[cnt++] = gs[i];
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : "+e.getMessage());
			
		}finally {
			System.out.println("인원이 가득 찼습니다. 다음차례를 기다리세요.");
			System.out.println("이번차례 탑승 명단");
			int i=0;
			for(i =0 ; i<onBoard.length ; i++) {
				System.out.println("이름 : "+onBoard[i].getName()+", 키 : "+onBoard[i].getHeight());
			}
			System.out.println("탑승자 요금 : "+rc.PRICE*(i));
		}
		
	}

}
