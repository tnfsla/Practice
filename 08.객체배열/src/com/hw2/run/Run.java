package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[10];
		int count = 0;
		while(true) {
			System.out.println("학년 : ");
			int grade = sc.nextInt();
			System.out.println("반 : ");
			int classroom = sc.nextInt();
			System.out.println("이름 : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("국어 성적 : ");
			int kor = sc.nextInt();
			System.out.println("영어 성적 : ");
			int eng = sc.nextInt();
			System.out.println("수학 성적 : ");
			int math = sc.nextInt();
			
			st[count] = new Student(grade,classroom,name,kor,eng,math);
			count++;
			if(count >=10) {
				break;
			}
			
			sc.nextLine();
			System.out.println("계속 추가하시겠습니까? (y/n)");
			char ch = sc.nextLine().charAt(0);
			if(ch =='n') {
				break;
			}
						
		}
		for(Student s : st) {
			if(s != null) {
			System.out.println(s.information());
			}
		}

	}

}
