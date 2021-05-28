package com.kh.chap03_stringTokenizer.run;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
//		StringTokenizer
//		: String(문자열)을 어던 특수기호를 기준으로 Token 단위로 나눠서 처리할때 사용함.
//		split 메소드와 유사하나, split메소드를 쓰면 String **배열**로 처리, StringTokenizer는 자체 **클래스**로 저장
		
		String str = "김남길,유산슬,유야호,카놀라유,로운";
		StringTokenizer st = new StringTokenizer(str, ","); //str을 ,로 구분해서 st에 저장해두겠다.
		
//		- countTokens() : 몇개의 토큰으로 나뉘어져있는지, 토큰 갯수 알려줌
		
		System.out.println(st.countTokens()); //5개
		int i = 0;
		while(st.hasMoreTokens()) { // 커서 다음에 토큰이 있는지 확인한다. (리스트같은 느낌이려나?) 
			String whStr = st.nextToken(); //다음 토큰이 있으면 리턴해줌 리턴한 후 토큰 갯수를 감소시킨다(문자를 하나씩 빼간다는 느낌)
			System.out.println(whStr);
			System.out.println(i++);      			// 횟수는 늘어나지만
			System.out.println(st.countTokens());	// 토큰 갯수는 줄어듬 (5(nextToken만나면 -1)->4->3->2->1->0)
		}

	}

}
