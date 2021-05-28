package com.kh.array;

import java.util.Scanner;

public class A_Array {
	public void method1() {
		// 일반변수 선언 - 메모리공간에 값을 기록해놓기위한 공간 >그메리중에 stack영역에 할당 되는 것
		int i;
		// 1. 배열 선언 - 배열을 선언하게 되면 변수 선언과 마찬가지로 stack영역에 박스가 생김, 이 박스는 실제 값을 담기위한 용도가 아니고
		// 주소를 보관하는 공간이다
		int[] iArr;
		double[] dArr;

		/*
		 * 
		 * 따라서 값을 담는 변수는 그냥 변수라고 하고 주소값을 담는 변수는 레퍼런스 변수(참조 변수)라고 표현한다.
		 * 
		 * 기본 자료형(boolean, char, byte, short, int, long, float, double) 로 선언한 변수 ->> 진짜
		 * 값(리터럴)을 담는 변수--> 변수
		 * 
		 * 
		 * 그 외 자료형(String, int[], char[]....) --> 주소값을 담는 변수--> 레퍼런스 변수(참조변수)
		 * 
		 */

		// 2. 배열 할당
		// 배열에담을 값들이 몇개 들어갈지 배열할당으로 크기를 반드시 지정해두어야 한다.
		// iArr = new int[] -> 크기지정하지 않으면 error 발생

		iArr = new int[5];
		dArr = new double[10];

		// 다음과 같이 new 라는 연산자를 통해서 배열을 할당하게 되면 메모리의 heap 영역에 해당 배열의 크기만큼 공간이 만들어지고
		// 그때 해당 공간에 고유한 주소값도 같이 부여되어 주소값을 stack 영역의 레퍼런스 변수에 저장하게 된다.
		// 따라서 해당 배열에 값을 넣거나 수정할 때 해당 주소를 참조해서 사용하게 된다.

		// 배열 선언과 할당을 동시에
		int[] iArr2 = new int[5];
		double[] dArr2 = new double[10];
		System.out.println("iArr : " + iArr);
		System.out.println("dArr : " + dArr);
		System.out.println("iArr2 : " + iArr2);
		System.out.println("dArr2 : " + dArr2);
		// 주소값이 출력된다.
		// heap영역의 메모리에는 변수를 만든다거나 직접적으로 접근하지 못하는 영역이고 주소값을 통해서 찾아갈수있다.
	}

	public void method2() {

		double[] dArr = new double[3];
		int[] iArr = new int[5];

		for (int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);

		}
		System.out.println("============");
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);

		}

		// 배열을 따로 초기화 하지 안흔다면 JVM이 지정한 잘료형의 기본값으로 배열을 초기화 한다.
		// heap 영역에는 값이 없는 공간이 존재할수 없다.->JVM이 자동으로 초기값 부여
		// 문자열의 길이 : length()
		// 배열 길이 : length

		System.out.println("dArr 의 길이 : " + dArr.length);
		System.out.println("dArr 의 길이 : " + iArr.length);

	}

	public void method3() {
		// 배열의 선언 및 할당
		int[] iArr = new int[5];
		// 배열 초기화
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);

		}

		System.out.println("iArr : " + iArr);// 주소값
		System.out.println("iArr의 해쉬코드 : " + iArr.hashCode()); // hashcode = 주소값의 10진수값

	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 할당할 배열의 길이 : ");
		int i = sc.nextInt();
		double[] dArr = new double[i];

		System.out.println(dArr);
		System.out.println("dArr의 길이 : " + dArr.length);

	}

	public void method5() {
		// 배열선언과 동시에 초기화하기
		int[] arr1 = { 1, 2, 3, 4 };
		// 중괄호 블럭을 사용하는 경우에는 new 연산자를 사용하지 않아도 되고, 내부적으로 수행해 준다.

		int[] arr2 = new int[] { 1, 2, 3, 4 };

		System.out.println("arr1의 길이 : " + arr1.length);
		System.out.println("arr2의 길이 : " + arr2.length);
		System.out.println(arr1 == arr2); // false : 둘은 값은 같지만 레퍼런스(참조)변수이기 때문에
		// 각 배열이 가리키고 있는 주소는 다름

	}

	public void method6() {
		String[] sArr = new String[5];
//		for(int i = 0; i<sArr.length; i++) {
//			System.out.println(sArr[i]);// 참조형 초기값 null
//		}

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sArr.length; i++) {
			System.out.println("과일 " + i + " : ");
			sArr[i] = sc.nextLine();
		}
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);// 참조형 초기값 null
		}
	}

	public void method7() {
		int iArr[] = new int[10];
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}

	public void method8() {
		//
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(i*2)+2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 길이 : "+arr.length);
		System.out.println("arr의 hashcode : "+arr.hashCode());

		//arr[5]=12; //java.lang.ArrayIndexOutOfBoundsException: 5 (배열크기 문제 오류)
		
		arr = new int[10];     //크기 변경; 크기변경하면 기존에 들어있떤 값들은 없어짐
		System.out.println("=====크기변경후 arr========");
		System.out.println("arr의 길이 : "+arr.length);
		System.out.println("arr의 hashcode : "+arr.hashCode());
		
		arr=null; //arr이 null을 참조할때
		
		System.out.println("=====삭제변경후 arr========");
		System.out.println("arr의 길이 : "+arr.length); 
		//java.lang.NullPointerException 비어있어서 생긴 오류(길이랄게 없습니다)
		System.out.println("arr의 hashcode : "+arr.hashCode());
		

	}

}
