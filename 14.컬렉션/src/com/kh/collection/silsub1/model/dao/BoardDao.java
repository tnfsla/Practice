package com.kh.collection.silsub1.model.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.collection.silsub1.model.vo.Board;

public class BoardDao {
	private ArrayList<Board> list = new ArrayList<Board>();

	public BoardDao() {
		// TODO Auto-generated constructor stub
	}

	public int getLastBoard() {
		return list.size() + 1;
	}

	public void writeBoard(Board board) {
		list.add(board);
	}

	public ArrayList<Board> displayAllList() {
		return list;
	}

	public Board displayBoard(int no) {
		Board a = null;
		if (no <= list.size()) {
			a = list.get(no - 1);
		}
		return a;
	}

	public void upReadCount(int no) {
		list.get(no-1).setReadCount(list.get(no-1).getReadCount() + 1);
	}

	public void modifyTitle(int no, String title) {
		list.get(no-1).setBoardTitle(title);
	}

	public void modifyContent(int no, String content) {
		list.get(no-1).setBoardContent(content);
	}

	public void deleteBoard(int no) {
		list.remove(no-1);
		for(int i =no-1 ; i<list.size() ; i++) {
			list.get(i).setBoardNo(list.get(i).getBoardNo()-1);
		}
	}

	public ArrayList<Board> searchBoard(String title) {
		ArrayList<Board> rt = new ArrayList<Board>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardTitle().contains(title)) {
				rt.add(list.get(i));
			}
		}
		return rt;
	}

	public void saveListFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.txt"))) {
			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
