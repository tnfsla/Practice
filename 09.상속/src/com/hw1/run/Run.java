package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[3];
		int cnt =0;
		st[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		st[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		st[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		System.out.println(st[0].information());
		System.out.println(st[1].information());
		System.out.println(st[2].information());
		
		Employee[] emp = new Employee[10];
		while(true) {
			System.out.println("사원의 이름 : ");
			String name = sc.nextLine();
			System.out.println("사원의 나이 : ");
			int age = sc.nextInt();
			System.out.println("사원의 키 : ");
			double height = sc.nextDouble();
			System.out.println("사원의 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("사원의 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.println("사원의 부서 : ");
			String dept = sc.nextLine();
			emp[cnt] = new Employee(name, age, height, weight, salary, dept);
			cnt++;
			
			System.out.println("계속 추가할 것 입니까?(y/n) ("+cnt+"/10)");
			char ch = sc.nextLine().charAt(0);
			if(ch == 'Y'||ch=='y') {
				if(cnt==10) {
					System.out.println("더이상 추가할 수 없습니다. 프로그램을 종료합니다.");
					break;
				}
				System.out.println("추가합니다.");
			}else if (ch == 'N'||ch=='n') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다.");
				break;
			}
		
		}
		for(int i = 0 ; i<cnt ; i++) {
			System.out.println(emp[i].information());
		}
		
		
	}

}
