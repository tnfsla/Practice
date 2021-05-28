package com.hw5.run;

import java.util.Scanner;

import com.hw5.model.vo.NumberOk;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NumberOk no = new NumberOk();
		while (true) {
			no.numGame();
			System.out.println("계속 하시겠습니까? (y/n)");
			while (true) {
				String result = sc.nextLine();
				if (result.equalsIgnoreCase("n")) {
					System.out.println("게임을 종료합니다.");
					return;
				} else if (result.equalsIgnoreCase("y")) {
					System.out.println("새로운 게임을 시작합니다!");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}

		}

	}

}
