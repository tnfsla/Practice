package com.kh.varable;

public class E_Printf {

	// System.out.printf("포맷", 출력하고자하는 값, 값, ...);
	// 출력하고자 하는 값들이 제시된 포맷(형식)에 맞춰서 출력만 진행 --> 한줄띄어쓰기는 안함
	// %d : 정수
	// %c : 문자        , %C 대문자로 출력
	// %s : 문자열 또는 문자도 가능     %S 대문자로 출력
	// %f : 실수

	/*
	 * \t : 정해진 공간만큼 띄어쓰기 \n : 출력하고 다음라인으로 옮김
	 * 
	 * 정렬방법 %5d : 5칸을 확보하고 오른쪽 정렬 %-5d : 5칸을 확보하고 왼쪽 정렬 %.2f : 소수점 아래 2자리까지만 표시
	 * 
	 */

	public void printMethod() {
		int iNum1 = 10;
		int iNum2 = 20;

		System.out.printf("%d\n", iNum1);
		System.out.printf("%d %d\n", iNum1, iNum2);
		System.out.printf("%d\n", iNum1, iNum2); //iNum1 만 출력되고 오류는 없음
		// System.out.printf("%d %d\n", iNum2);  -- 두번째 포맷에 들어갈 수가 없으므로 에러발생

		System.out.printf("%d + %d = %d \n",iNum1, iNum2, iNum1+iNum2);
		System.out.printf("%5d\n",iNum1);
		float fNum = 1.23445467f;
		double dNum = 4.53;
		System.out.printf("%.3f\t%.3f\n",fNum, dNum);  // %f 실수 값을 소수점 아래 6째자리까지 보여줌, 넘어가게 되면 반올림, 소수점 아래값 없으면 자동 0으로 채움
		
		
		System.out.println(0100); //8진수
		System.out.println(0x1E0);//16진수
	}
}
