package com.kh.dimension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DimensionalArray {
	public void method1() {
		/*
		 * 1. 2차원 배열 선언 자료형 배열명[][]; 자료형[] 배열명[]; 자료형[][] 배열명;
		 */

		int arr1[][];
		int[] arr2[];
		int[][] arr3;

		/*
		 * 2. 2차원 배열 할당 배열명 = new 자료형[행크키][열크키]
		 */
		arr1 = new int[3][5];

		// 행의 길이
		System.out.println("행의 길이 : " + arr1.length);
		// 열의 길이
		System.out.println("열의 길이 : " + arr1[0].length);
		System.out.println("열의 길이 : " + arr1[1].length);
		System.out.println("열의 길이 : " + arr1[2].length);

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print("*");
				arr1[i][j] = 1;
			}
			System.out.println();
		}
	}

	public void method2() {
		int[][] arr = new int[3][5];

		// 1. 직접 인덱스에 접근
		// arr[0][0]=1;
		// arr[0][1]=2;
		// ...
		// arr[2][4]=15;

		// 2. for문
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method3() {
		// 3. 할당과 동시에 초기화
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method4() {
		// 가변배열
		// 행은 정해져있으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		// 자료형이 같은 1차원 배열 여러개를 하나로 묶은게 2차원 배열이라면
		// 묶여있는 1차원 배열의 길이가 꼭같을 필요는 없다.

		int[][] arr = new int[3][];

		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method5() {
		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method6() {
		DecimalFormat f1 = new DecimalFormat("0.00");// 소수 둘째까지 반올림한다
		//이후 사용할 때는 f1.format(arr) 형식으로 사용
		Scanner sc = new Scanner(System.in);
		double[][] arr = new double[2][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (i == 0) {
					System.out.println("국어 점수 : ");
				} else {
					System.out.println("영어 점수 : ");
				}
				arr[i][j] = sc.nextDouble();
				arr[i][arr[i].length-1]+=arr[i][j];
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(f1.format(arr[i][j]) +" ");
			}
			System.out.println();
		}
		
	}
	public void method7() {
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] arr1 = new int[3][3];
		
		for(int i =0 ; i<arr1.length; i++) {
			for(int j =0; j<arr1[i].length; j++) {
				arr1[i][j] = arr[i*arr1.length+j];
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println();
		}
		
	}
	
	public void bingo(){
		Scanner sc = new Scanner(System.in);
		
		int[] temArr = new int[25];
		for(int i = 0; i<temArr.length ; i++) {
			temArr[i]=(int)(Math.random()*25+1);
			for(int j=0; j<i; j++) {
				if(temArr[i] == temArr[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] arr = new int[5][5];
		int index =0;
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = temArr[index++];				
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
		int count = 0;
		System.out.println("========빙고게임 시작========");
		
		while(true) {
			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			count++;
			for(int i = 0; i<arr.length;i++) {
				for(int j =0; j<arr[i].length; j++) {
					if(arr[i][j] == num) {
						arr[i][j] = 0;
					}
					System.out.printf("%4d",arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("게임을 끝내시겠습니까? (Y/N) : " );
			char ch = sc.nextLine().charAt(0);
			if(ch =='Y') break;
								
		}
		System.out.println(count + "번 입력하였습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
