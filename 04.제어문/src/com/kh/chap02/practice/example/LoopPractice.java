package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1이상의 숫자를 입력하세요");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			break;

		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1이상의 숫자를 입력하세요");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
			break;

		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요");
		int num = sc.nextInt();
		String result = "";
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			result += i;
			sum += i;
			if (num == i)
				break;
			result += " + ";
		}
		System.out.println(result + " = " + sum);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자");
		int num2 = sc.nextInt();
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자만을 입력해주세요");
			return;
		}
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");

		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("첫번째 숫자");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자");
			int num2 = sc.nextInt();
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자만을 입력해주세요");
				continue;
			}
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			break;
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		System.out.println("=======" + num + "단========");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		if (num >= 2 && num <= 9) {
			for (int j = num; j <= 9; j++) {
				System.out.println("=======" + j + "단========");
				for (int i = 1; i <= 9; i++) {
					System.out.println(j + " * " + i + " = " + j * i);
				}
			}
		} else {
			System.out.println("2~9사이의 숫자만 입력하세요");
		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자 : ");
			int num = sc.nextInt();
			if (num >= 2 && num <= 9) {
				for (int j = num; j <= 9; j++) {
					System.out.println("=======" + j + "단========");
					for (int i = 1; i <= 9; i++) {
						System.out.println(j + " * " + i + " = " + j * i);
					}
				}
				return;
			} else {
				System.out.println("2~9사이의 숫자만 입력하세요");
			}
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작숫자 : ");
		int num = sc.nextInt();
		System.out.println("공차 : ");
		int d = sc.nextInt();
		int i = 1;

		while (i <= 10) {
			System.out.print(num + " ");
			num += d;
			i++;
		}

	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("연산자(+,-,*,/,%)");
			String op = sc.nextLine();
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("정수 1 : ");
			int num1 = sc.nextInt();
			System.out.println("정수 2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			if (op.equals("+")) {
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 + num2);

			} else if (op.equals("-")) {
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 - num2);

			} else if (op.equals("*")) {
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 * num2);

			} else if (op.equals("/")) {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 / num2);
				}
			} else if (op.equals("%")) {
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 % num2);
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
			}
		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		if (num < 2) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}

		if (cnt == 2) {
			System.out.println("소수입니다.");

		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		while (true) {
			int num = sc.nextInt();
			int cnt = 0;
			if (num < 2) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					cnt++;
				}
			}

			if (cnt == 2) {
				System.out.println("소수입니다.");
				break;

			} else {
				System.out.println("소수가 아닙니다.");
				break;
			}
		}

	}

	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		int cnt = 0;
		int cnt1 = 0;
		if (num < 2) {
			System.out.println("잘못입력하셨습니다.");
		}
		for (int j = 2; j <= num; j++) {
			cnt = 0;
			for (int i = 1; i <= num; i++) {
				if (j % i == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(j + " ");
				cnt1++;
			}
		}
		System.out.println();
		System.out.println("2부터 " + num + "까지 소수의 개수는 " + cnt1 + "개 입니다.");

	}

	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int input = sc.nextInt();
		int i = 1;
		int cnt = 0;
		while (i <= input) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else if (i % 3 == 0) {
				System.out.print(i + " ");
			}

			if (i % 6 == 0) {
				cnt++;
			}
			i++;
		}
		System.out.println();
		System.out.println("count : " + cnt);

	}

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j >= 1; j--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= (num * 2) - 1; i++) {

			if (i <= num) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = num * 2 - i; j >= 1; j--) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}

	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j >= 1; j--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if ((i == 1 || i == num) || (j == 1 || j == num)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}
	}

}
