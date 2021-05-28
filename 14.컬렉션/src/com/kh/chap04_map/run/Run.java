package com.kh.chap04_map.run;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.model.vo.Student;

public class Run {

	/*
	 * Map : 데이터를 저장할때 각각의 자료를 구분지을수 있는 고유의 값을 정하여 해당값으로 접근할수 있는 실제 객체를 묶어 함꼐 관리하는
	 * 자료 구조 클래스. 해당객체를 저장할때 key(고유의값 ) 은 set 의 특성으로 value(실제객체)는 List 의 특성으로 관리한다.
	 * 종류는 크게 HashMap, HashTable(예전버전 -HashMap과 동일 스레드세이프가있다 ), TreeMap, Properties
	 * 등이 있다.
	 * 
	 * - map은 key와 value로 구분되어 있고 이걸 로그인 할 때 ID와 PWD처럼 생각하면 편하다. (ID는 중복 불가능, 즉 Set과
	 * 관련이 있음을 알 수 있다.)
	 * 
	 * - key와 value를 묶어서 Entry라고 한다.
	 * 
	 * - key값은 보통 String으로 하는데, 이유는 int를 쓰면 ArrayList와 차이가 없기 때문이다.
	 */

	private HashMap<String, Student> stdMap = new HashMap<String, Student>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run m = new Run();
		m.test1();

	}

	private void test1() {
		// TODO Auto-generated method stub
		HashMap map = new HashMap(); // map은 키와 벨류로 들어감
		map.put(1, "a");
		map.put(3, "4");
		map.put(22, "6");
		map.put(4, "22");

		System.out.println(map); // 순서 보장이 안됨, 오름차순 자동정렬

		stdMap.put("커피", new Student(1, "최선호"));
		stdMap.put("도넛", new Student(2, "권민지"));
		stdMap.put("라면", new Student(3, "박서형"));

		System.out.println("덮어 쓰기 전 : " + stdMap);

		stdMap.put("커피", new Student(4, "홍영은"));
		System.out.println("같은 키값으로 덮어 쓴 후 : " + stdMap); // 같은 키값인 "커피"의 value가 바뀜

		stdMap.put("젤리", new Student(4, "홍영은"));
		System.out.println("같은 value로 덮어 쓴 후 : " + stdMap); // 새로운 키값이기때문에 새로생김 , 앞에 생성????

		Student s = stdMap.get("커피");
		System.out.println("커피로 검색한 학생 : " + s);

		Student removed = stdMap.remove("커피");
		System.out.println("커피로 삭제된 학생 : " + removed);
		System.out.println("제외한 후 남은 학생 : " + stdMap);

		// 1.keySet
		// value를 얻고자 할 때 Set인 키들을 뽑아와서 Set형에 담아서 출력
		// key값을 set<String>으로 만들어서 iterator에 담는다.

		System.out.println("**********key**********");
		Set<String> kset = stdMap.keySet(); // stdMap의 key들의 집합
		Iterator<String> iter = kset.iterator(); // iter 반복자에 kset을 담는작업
		while (iter.hasNext()) {
			String key = iter.next(); // 있으면 키를 담은 후에
			Student val = stdMap.get(key); // key와 연결된 value를 가져와서 Student타입인 val에 담아줌
			System.out.println(key + "\t" + val);
		}

		// 2.values 메소드로 값만 뽑기
		System.out.println("*********Collection*********");
		Collection values = stdMap.values(); // 값으로 출력하기

		Iterator iter1 = values.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		//3. EntrySet : key와 value를 같이 얻어오고자 할때, Map의 내부인터페이스인 Entry타입을 사용
		//key와 value를 묶어서 Entry
		//entrySet : Map.Entry의 모음
		
		System.out.println("***********Entry***********");
		Set<Entry<String,Student>> eSet1=stdMap.entrySet(); // stdMap에 있는 키와 벨류값 세트로 eSet 컬렉션에 담는 과정(키와 벨류세트의 집합)
		Iterator<Entry<String,Student>> it1 = eSet1.iterator(); // eSet에 있는 키와 벨류값을 세트로 Iterator에 담는과정
		
		while(it1.hasNext()) {
			Entry<String,Student> entry = (Entry)it1.next();// (Entry)생략해도 ㄱㅊ 엔트리 타입으로 변환됨.
			System.out.println(entry.getKey() + " = "+entry.getValue());
		}
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
