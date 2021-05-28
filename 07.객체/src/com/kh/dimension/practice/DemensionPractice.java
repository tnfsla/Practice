package com.kh.dimension.practice;

import java.util.Scanner;

public class DemensionPractice {
	public void practice1() {
		int[][] arr = new int[4][4];
		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = new int[4][4];
		int cnt = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt--;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		String[][] arr = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
				arr[i][arr.length - 1] += arr[i][j];
				arr[arr.length - 1][j] += arr[i][j];
				arr[arr.length - 1][arr.length - 1] += arr[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("행크기 : ");
			int r = sc.nextInt();
			System.out.println("열크기 : ");
			int c = sc.nextInt();
			
			if(r>10||r<1||c>10||c<1) {
				System.out.println("반드시 1~10사이의 정수를 입력해야합니다.");
				continue;
			}

			char[][] arr = new char[r][c];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char) (Math.random() * 26 + 65);
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%3c", arr[i][j]);
				}
				System.out.println();
			}
			break;
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i]);
			}
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("행크기 : ");
		int r = sc.nextInt();
		char[][] arr = new char[r][];
		for (int i = 0; i < r; i++) {
			System.out.println(i + "행의 크기 : ");
			int c = sc.nextInt();
			arr[i] = new char[c];
		}
		char n = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice8() {
		String[] stu = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		int cnt = 0;
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		System.out.println("== 1분단 ==");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = stu[cnt++];
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = stu[cnt++];
				System.out.print(arr2[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] stu = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		int cnt = 0;
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		System.out.println("== 1분단 ==");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = stu[cnt++];
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = stu[cnt++];
				System.out.print(arr2[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		String where = "오른쪽";

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (name.equals(arr1[i][j])) {
					if (j == 0) {
						where = "왼쪽";
					}
					System.out.println("검색하신 " + name + " 학생은 1분단 " + (i + 1) + "번째 줄 " + where + "에 있습니다.");
				}
				if (name.equals(arr2[i][j])) {
					if (j == 0) {
						where = "왼쪽";
					}
					System.out.println("검색하신 " + name + " 학생은 2분단 " + (i + 1) + "번째 줄 " + where + "에 있습니다.");
				}
			}
		}

	}

}
