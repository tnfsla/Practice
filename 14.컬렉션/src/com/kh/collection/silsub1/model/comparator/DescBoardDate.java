package com.kh.collection.silsub1.model.comparator;

import java.util.Comparator;

import com.kh.collection.silsub1.model.vo.Board;

public class DescBoardDate implements Comparator<Board>{

	@Override
	public int compare(Board o1, Board o2) {
		// TODO Auto-generated method stub
		return o2.getBoardDate().compareTo(o1.getBoardDate());
	}

	
}
