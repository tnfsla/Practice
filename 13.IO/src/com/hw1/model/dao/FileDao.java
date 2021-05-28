package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);

	public FileDao() {
		// TODO Auto-generated constructor stub
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String str = "";
		while (true) {
			System.out.println("파일에 저장할 내용을 반복해서 입력하세요 : ");
			str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			} else {
				sb.append(str);
			}
		}

		System.out.println("저장 하시겠습니까? (y/n)");
		char save = sc.nextLine().charAt(0);
		if (save == 'Y' || save == 'y') {
			System.out.println("저장할 파일 명을 입력하세요 : ");
			String name = sc.nextLine();
			BufferedWriter bw = null;

			try {
				bw = new BufferedWriter(new FileWriter(name));
				bw.write(sb+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (bw != null)
						bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else {
			System.out.println("저장하지 않습니다.");
		}

	}

	public void fileOpen() {
		System.out.println("열 파일명을 입력하세요 : ");
		String name = sc.nextLine();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(name));

			String value = ""; // EOF(파일의 끝)을 만나면 -1 이니까
			while ((value = br.readLine()) != null) {
				System.out.println(value); // 기존은 byte 형, 형변환해서 문자형으로
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void fileEdit() {
		System.out.println("수정 할 파일 명 : ");
		String name = sc.nextLine();
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new FileReader(name));
			String value = "";
			while ((value = br.readLine())!=null) {
				System.out.println(value);
			}
			String str = "";
			while (true) {
				System.out.println("파일에 추가할 내용을 입력하세요 : ");
				str = sc.nextLine();
				if (str.equals("exit"))
					break;
				sb.append(str);
			}

			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			char save = sc.nextLine().charAt(0);
			if (save == 'Y' || save == 'y') {
				bw = new BufferedWriter(new FileWriter(name,true));
				bw.write(sb+"\n");
				System.out.println("추가되었습니다.");
			}else {
				System.out.println("추가하지 않습니다.");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(bw!=null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
