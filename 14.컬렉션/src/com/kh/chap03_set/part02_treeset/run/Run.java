package com.kh.chap03_set.part02_treeset.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap03_set.part02_treeset.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>();
//		TreeSet<String> ts = new TreeSet<>(); 똑같음
		
		ts.add(new String("하하하"));
		ts.add(new String("나나나"));
		ts.add(new String("가가가"));
		ts.add(new String("다다다"));
		ts.add(new String("하하하")); // 중복삭제
		
		System.out.println(ts); // 알아서 오름차순정리
		
		TreeSet<Student> ts2 = new TreeSet<>(); //이렇게만 하면 오류발생 imnplement해야함
		ts2.add(new Student("서연",20,100));
		ts2.add(new Student("민지",22,90));
		ts2.add(new Student("로운",21,30));
		ts2.add(new Student("서연",31,90));
		
		System.out.println(ts2);
		
		/*
		 * TreeSet의 경우 hashCode(), equals()를 가지고 중복판단을 하지않고,
		 * comparable()에 제시한 정렬필드가 같은 경우 동일객체로 판단
		 */
		
		//1. for each문으로 출력
		for(Student s : ts2) {
			System.out.println(s);
		}
		
		//2. ArrayList에 담아서 출력
		ArrayList<Student> a1 = new ArrayList<Student>(ts2);
		for(int i =0 ; i<a1.size() ; i++) {
			System.out.println(a1.get(i));
		}
		
		//3. Iterator 사용해서 출력
		Iterator<Student> i1 = a1.iterator(); //a1도 담기고, ts2도 담김
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		Iterator i2 = ts.iterator(); //객체형이 아니면 제네릭없이
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		

	}

}
