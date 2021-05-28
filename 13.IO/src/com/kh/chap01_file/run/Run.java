package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		
		//file : 파일을 제어하기 위한 클래스로 입출력 기능을 제공하지 않는다. - 파일의 입출력은 스트림을 사용해야한다.
		
		try {
			//1. 경로지정을 안할 시에 프로젝트 폴더 안에 생성됨
			File f1 = new File("test.txt"); // 메모리상에 존재, 객체로 있는 상태
//			f1.createNewFile();
			
			//2. 존재하는 기본 드라이브나 폴더에 파일 생성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			//3. 
//			File f3 = new File("c:\\test\\test.txt"); // 폴더 자동생성 못함
//			f3.createNewFile();
			File testFolder = new File("C:\\test");
			testFolder.mkdir(); // 폴더를 생성해줌
			File f3 = new File("c:\\test\\test.txt");
			f3.createNewFile();
			
			System.out.println(f3.exists()); // 존재여부
			System.out.println(f1.exists()); // f1만 선언된 상태이고, create 하기 전에면 false 나옴, 
			System.out.println(testFolder.exists());
			System.out.println(f3.isFile());// file타입인지 확인
			System.out.println(testFolder.isFile()); // 폴더는 file 타입이 아니어서 false
			
			File folder = new File("parent"); // 확장자없이 생성하면 디렉토리 생성
			folder.mkdir();
			
			File file = new File("parent\\person.txt"); // 디렉토리에 txt파일생성
			file.createNewFile();
			
			System.out.println("파일명 : "+file.getName()); //file의 파일명가져오기
			System.out.println("절대경로 : "+file.getAbsolutePath()); //file의 절대경로 가져오기
			System.out.println("상대경로 : "+file.getPath()); // file의 상대경로
			System.out.println("파일용량 : "+file.length()); //file의 용량
			System.out.println("상위 폴더 : "+file.getParent()); //file의 상위폴더
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
