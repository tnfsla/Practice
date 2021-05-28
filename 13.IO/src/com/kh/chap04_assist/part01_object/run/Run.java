package com.kh.chap04_assist.part01_object.run;

import com.kh.chap04_assist.part01_object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectsDao od = new ObjectsDao();
		od.fileSave();
		od.fileOpen();

	}

}
