package com.kh.chap01_list_part02_list.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list_part02_list.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제네릭스<> 사용 이유 : 	1. 명시된 타입의 객체만 저장하도록 제한을 두기 위해
		//					2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 형변환 하는 절차를 없애기 위해
		
		//원래는  Object형으로 모든 자료형을 wrapper하여 객체로 바꿔 다 받을 수 있지만, Music 객체만 받기위해서 <Music> 한다
		//E->Element : 리스트에 담길 요소 (객체)
		ArrayList<Music> list = new ArrayList<Music>(3); // 굳이 숫자를 주진 않는다.
		
		// 1. add(E e) : 리스트의 끝에 인스턴스 데이터를 추가하는 메소드(내부적으로 사이즈 검사한 후 수용가능한 범위면 추가가 되고, 넘어가면 알아서 사이즈를 늘려준 후 추가된다.)
		list.add(new Music("Good Bye","박효신"));
		list.add(new Music("숨","박효신"));
		list.add(new Music("Dank","박재범"));
		// list.add("끝"); music 인스턴스가 아니어서 안됨
		
		System.out.println(list.toString());
		
		// 2. add(index, E e) : 인덱스를 지정하여 해당 인덱스에 인스턴스추가
		list.add(1, new Music("당신과는 천천히","장범준")); // 크기 제약이 없다, 3으로 선언했지만 넘어가도 추가가 된다.
		System.out.println(list.toString());
		
		// 3. set(index, E e) : 인덱스를 지정하여 수정
		list.set(0, new Music("잠이 오질 않네요","장범준"));
		System.out.println(list.toString());
		
		// 4. size() : 리스트안에 몇개의 데이터가 있는지
		System.out.println(list.size());
		
		// 5. remove(index) or remove(Object): 인덱스 삭제 이후 크기 줄어들고 인덱스 땡겨줌
//		list.remove(2);
		list.remove(new Music("숨","박효신")); //이렇게는 지울 수 없음. equals를 오버라이딩해서 이용해야함
		System.out.println(list);
		System.out.println(list.size());
		
		// 6. get(index) : 해당 인덱스의 인스턴스가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(0).getArtist());
		
		// 7. subList(index1, index2) : 추출해서 새로운 List로 반환 index1부터 index2 사이에 있는 값 (index2 포함하지 않음) 
		List sub = list.subList(0, 2); // 0~1
		System.out.println(sub);
		
		// 8. addAll(Collection c) : 콜렉션을 통채로 뒤에 추가하는 메소드
		list.addAll(sub);
		System.out.println(list);
		System.out.println(list.size());
		
		
	}

}
