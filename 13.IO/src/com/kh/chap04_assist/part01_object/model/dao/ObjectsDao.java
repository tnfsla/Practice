package com.kh.chap04_assist.part01_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.chap04_assist.part01_object.model.vo.Phone;

public class ObjectsDao {
	
	public void fileSave() {
		/*Phone[] arr = new Phone[3];
		
		arr[0] = new Phone("엘지",300000);
		arr[1] = new Phone("애플",100000);
		arr[2] = new Phone("삼성",500000);
		*/
		
		//객체 배열이 아닌 컬렉션이용
		//제네릭스<> 사용 이유 : 	1. 명시된 타입의 객체만 저장하도록 제한을 두기 위해
		//					2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 형변환 하는 절차를 없애기 위해
		ArrayList<Phone> phoneList = new ArrayList<Phone>();// ArrayList 제네릭<Phone> 객체만 담을 수 있게 제한을 둠 --> 형변환을 할필요 없음
		phoneList.add(new Phone("엘지",300000));
		phoneList.add(new Phone("애플",100000));
		phoneList.add(new Phone("삼성",500000));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone1.txt"))){
			
			for(int i =0; i<phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		
		ArrayList<Phone> phoneList = new ArrayList<Phone>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone1.txt"))){
			
			int i = 0;
			while(true) {
				phoneList.add((Phone)ois.readObject());
				System.out.println(phoneList.get(i));
				i++;
			}
			
		}catch( EOFException e ) {
			System.out.println("파일 읽기 완료");
			return;
			//파일에 더이상 읽을 내용이 없을때 발생하는 Exception
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
