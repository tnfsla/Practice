package com.kh.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub1.model.comparator.AscBoardDate;
import com.kh.collection.silsub1.model.comparator.AscBoardNo;
import com.kh.collection.silsub1.model.comparator.AscBoardTitle;
import com.kh.collection.silsub1.model.comparator.DescBoardDate;
import com.kh.collection.silsub1.model.comparator.DescBoardNo;
import com.kh.collection.silsub1.model.comparator.DescBoardTitle;
import com.kh.collection.silsub1.model.dao.BoardDao;
import com.kh.collection.silsub1.model.vo.Board;

public class BoardManager {
	private Scanner sc = new Scanner(System.in);
	private BoardDao bd = new BoardDao();
	
	public BoardManager() {
		// TODO Auto-generated constructor stub
	}

	public void writeBoard() {
		System.out.println("새 게시글 쓰기입니다.");
		System.out.println("글 제목(공백 포함) : ");
		String boardTitle = sc.nextLine();
		System.out.println("작성자(공백 없이) : ");
		String boardWriter = sc.nextLine();
		String boardContent = "";
		String boardContentEsc="";
		Date boardDate = new Date();
		while (true) {
			System.out.println("글 내용(exit를 입력해야 종료됩니다) : ");
			boardContent = sc.nextLine() + " ";
			if (boardContent.equals("exit ")) {
				break;
			}else {
				boardContentEsc += boardContent;
			}
		}
		int boardNo = bd.getLastBoard();
		bd.writeBoard(new Board(boardNo, boardTitle, boardWriter, boardDate, boardContentEsc, 0));

	}

	public void displayAllList() {
		Iterator<Board> iter = bd.displayAllList().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

	public void displayBoard() {
		System.out.println("조회할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();

		if (bd.displayBoard(no) == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			bd.upReadCount(no);
			System.out.println(bd.displayBoard(no).toString());
		}

	}

	public void modifyTitle() {
		System.out.println("수정할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		if (bd.displayBoard(no) != null) {
			System.out.println(bd.displayBoard(no).toString());
			System.out.println("변경할 글 제목 : ");
			String boardTitle = sc.nextLine();
			bd.modifyTitle(no, boardTitle);
		} else {
			System.out.println("조회된 글이 없습니다.");
		}
	
	}

	public void modifyContent() {
		System.out.println("수정할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		if (bd.displayBoard(no) != null) {
			System.out.println(bd.displayBoard(no).toString());
			System.out.println("변경할 글 내용 : ");
			String boardContent = sc.nextLine();
			bd.modifyContent(no, boardContent);
		} else {
			System.out.println("조회된 글이 없습니다.");
		}
	
	}

	public void deleteBoard() {
		System.out.println("삭제할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		if (bd.displayBoard(no) != null) {
			System.out.println(bd.displayBoard(no).toString());
			System.out.println("정말 삭제하시겠습니까? (y/n)");
			char yn = sc.nextLine().charAt(0);
			if (yn == 'y' || yn == 'Y') {
				bd.deleteBoard(no);
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("삭제하지 않았습니다.");
			}
		} else {
			System.out.println("조회된 글이 없습니다.");
		}
	
	}

	public void searchBoard() {
		System.out.println("검색할 제목 :");
		String boardTitle = sc.nextLine();
		if (!bd.searchBoard(boardTitle).isEmpty()) {
			System.out.println(bd.searchBoard(boardTitle).toString());
		} else {
			System.out.println("검색결과가 없습니다.");
		}
		
	}

	public void saveListFile() {
		bd.saveListFile();
	}

	public void sortList(int item, boolean isDesc) {
		ArrayList<Board> a1 = bd.displayAllList();
		switch (item) {
		case 1:
			if (isDesc == true) {
				a1.sort(new DescBoardNo());
			} else {
				a1.sort(new AscBoardNo());
			}
			for(Board b : a1) {
				System.out.println(b);
			}
			break;
		case 2:
			if (isDesc == true) {
				a1.sort(new DescBoardDate());
			} else {
				a1.sort(new AscBoardDate());
			}
			for(Board b : a1) {
				System.out.println(b);
			}
			break;
		case 3:
			if (isDesc == true) {
				a1.sort(new DescBoardTitle());
			} else {
				a1.sort(new AscBoardTitle());
			}
			for(Board b : a1) {
				System.out.println(b);
			}
			break;

		}
	}
}
