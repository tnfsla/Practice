package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method1() {
		int num1 = 20;
		int num2 = 10;
		System.out.println("= 변경전 =");
		System.out.println("num 1 : "+num1);
		System.out.println("num 2 : "+num2);
		
		int temp; 
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("= 변경후 =");
		System.out.println("num 1 : "+num1);
		System.out.println("num 2 : "+num2);
		
		
	}
	
	public void method2() {
		int[] arr= {2,1,3};
		int temp;
		
		temp = arr[0];
		arr[0] = arr[1];
		arr[1]=temp;
		
		for(int i =0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}		
	}
	
	public void method3() {
		
		// 삽입정렬(insertion sort)
				// 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘
				// 배열의 n번 인덱스값을 0번 ~ n-1 번 인덱스 까지 비교
				
				// 비교주체      비교대상
				// i=1일때      j=0~0
				// i=2일때 	   j=0~1
				// i=3일때 	   j=0~2
				// i=4일때 	   j=0~3
				
				// i=1~마지막인덱스   //j=0~i-1
				
		int[] arr = {2,5,4,1,3};
		int temp;
//		for(int i =1; i<arr.length; i++) {
//			for(int j =0 ; j<arr.length; j++) {
//				if(arr[i]<arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		// 이것도 되긴함
		  
		//이게 극한의 효율
		for(int i =1; i<arr.length ; i++) {
			for(int j =0; j<i; j++) {
				if(arr[i] < arr[j]) {
					System.out.println("==교환발생==");
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		for(int i =0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method4() {
		// 선택정렬(selection sort)
				// 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
				// 데이터의 양이 적을 때 좋은 성능을 띄는 정렬(교환횟수가 적음)
				// 하지만 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에 100개 이상의 자료에서는 급격하게 속도 저하
				// 배열의 n번 인덱스값을 n+1번 ~ 마지막 인덱스까지 비교
				
				
				// 비교주체    비교대상
				// i=0 일 때  j=1~5
				// i=1 일 때  j=2~5
				// i=2 일 때  j=3~5
				// i=3 일 때  j=4~5
				// i=4 일 때  j=5~5
				
				// i=0부터 마지막까지 반복할 때
				// j=i+1부터 마지막까지 반복
		
		//오름차순 정렬
		int[] arr = {2,5,4,1,3};
		int temp;
		
		for(int i =0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length ; j++) {
				if(arr[i] > arr[j]) {
					System.out.println("==교환발생==");
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		// 2 5 4 1 3
		// 1 5 4 2 3
		// 1 4 5 2 3
		// 1 2 5 4 3
		// 1 2 4 5 3
		// 1 2 3 5 4
		// 1 2 3 4 5
		
		for(int i =0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
				
	}
	
	public void method5() {
		int[] arr = {2,5,4,1,3};
		//오름차순
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//내림차순은 없으니 만들어야함
		
	}

}
