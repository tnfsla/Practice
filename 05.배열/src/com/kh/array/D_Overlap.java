package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	public void method1() {
		// 중복 제거
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 정수 값 : ");
			arr[i] = sc.nextInt();

			for (int j = 0; j < i; j++) {
				System.out.println(arr[i] + "   " + arr[j]);
				if (arr[i] == arr[j]) {
					System.out.println("중복값이 존재합니다");
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void method2() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("중복값이 존재합니다");
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public void method3() {
		int[] arr= new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i =0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length ; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}