package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * 배열의 복사 - 얕은복사 : 배열의 주소만 복사 - 깊은복사 : 동일한 배열을 하나 더 생성해서 실제 내부값을 복사
	 * 
	 */

	public void method1() {
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = origin;

		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		copy[2] = 1000000;
		System.out.println("===============바꾼후==========");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		// 얕은 복사이기 때문에, 주소는 동일함 따라서 copy의 값을 바꾸면 origin에도 영향이 있음
		System.out.println();
		System.out.println("origin 주소 : " + origin.hashCode());
		System.out.println("copy 주소 : " + copy.hashCode()); // 주소 동일
	}

	public void method2() {
		// 깊은 복사

		// 1. for문 이용
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = new int[10];

		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}

		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

		System.out.println();
		copy[2] = 1000;

		System.out.println("===============바꾼후==========");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin 주소 : " + origin.hashCode());
		System.out.println("copy 주소 : " + copy.hashCode()); // 주소 동일
	}
	
	public void method3() {
		//2. 새로운 배열을 생성하고 System 크래스의 arraycopy()매소드 이용한 복사
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = new int[10];
		//				( 원본  , 원본시작점, 복사본, 복사시작점, 총 복사길이)
		System.arraycopy(origin, 0, copy, 2, origin.length);
		

		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

		System.out.println();
		copy[2] = 1000;

		System.out.println("===============바꾼후==========");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin 주소 : " + origin.hashCode());
		System.out.println("copy 주소 : " + copy.hashCode()); // 주소 동일
		
	}
	
	public void method4() {
		//3. Arrays 클래스에서 제공하는 copyOf() 매소드 사용
		// Arrays 클래스는 배열을 이용할때 유용한 매소드를 모아놓은 클래스
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = Arrays.copyOf(origin, 10); // 작게하려면 작게가져와도 되고,
												//크게는 크게가져오면 나머지는 0으로 자동 초기화됨
		//Arrays.copyOfRange(original, from, to) 응용임. 범위 설정 가능 from<=x<to to는 포함 안되는듯.
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}

	}
	
	/*
	 * System.arraycopy() 매소드는 내가 복사하고자 할 때 인덱스와 갯수를 지정하고 싶을 때 사용, 복사본 배열 크기 그대로 유지
	 * Array.copyOf() 내가 복사하고자 하는것을 복사할 때 크기도 다시 지정하고 싶을 때 사용
	 */
	public void method5() {
		//4. clone()메소드를 이용한 복사
		// 시작 인덱스 지정 안됨, 원본 배열을 통채로 복사해서 새로운 배열을 할당함
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = origin.clone();
		

		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소 : " + origin.hashCode());
		System.out.println("copy 주소 : " + copy.hashCode()); // 주소 동일
		

	}
}












































