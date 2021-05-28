package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
	}

	public void practice2() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
		}
		System.out.println(Arrays.toString(arr));

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		int i = sc.nextInt();
		int[] arr = new int[i];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = j + 1;
		}
		System.out.println(Arrays.toString(arr));
	}

	public void practice4() {
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(arr[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		String count = "";
		char[] arr = new char[str.length()];
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				count += i;
				count += " ";
				cnt++;
			}
		}

		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + count);
		System.out.println(ch + "개수 : " + cnt);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] arr = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if (num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(arr[num]);
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : " + sum);

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("정수 : ");
			int num = sc.nextInt();
			int[] arr = new int[num];
			if (num % 2 == 0 || num < 3) {
				System.out.println("다시입력하세요.");
				continue;

			} else {
				for (int i = 0; i < arr.length / 2 + 1; i++) {
					arr[i] = i + 1;
				}
				for (int i = arr.length / 2 + 1; i < arr.length; i++) {
					arr[i] = arr.length - i;
				}
				System.out.println(Arrays.toString(arr));

			}
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chic = { "후라이드", "양념", "간장", "마늘", "반반" };
		System.out.println("치킨 이름을 입력하세요");
		String str = sc.nextLine();
		for (int i = 0; i < chic.length; i++) {
			if (str.equals(chic[i])) {
				System.out.println(str + "치킨 배달 가능");
				return;
			}
		}
		System.out.println(str + "치킨은 없는 메뉴입니다.");

	}

	public void practice10() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println(Arrays.toString(arr));

	}

	public void practice11() {
		int[] arr = new int[10];
		int max = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("최대값 : " + arr[9] + "\n최소값 : " + arr[0]);

	}

	public void practice12() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		char[] arr = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			if (i > 7) {
				arr[i] = '*';
			} else {
				arr[i] = num.charAt(i);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	public void practice14() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

	}

}
