package com.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.hw3.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	String filename = "books.dat";
	public BookManager() {
		// TODO Auto-generated constructor stub
	}

	public void fileSave() {
		Book[] bk = new Book[5];
		{
			bk[0] = new Book("C언어", "김씨", 10000, setCalendar(2012, 2, 2), 0.1);
			bk[1] = new Book("자바", "이씨", 20000, setCalendar(2013, 3, 3), 0.2);
			bk[2] = new Book("C++", "박씨", 30000, setCalendar(2014, 4, 4), 0.3);
			bk[3] = new Book("넛지", "서씨", 40000, setCalendar(2015, 5, 5), 0.4);
			bk[4] = new Book("개미", "최씨", 50000, setCalendar(2016, 6, 6), 0.5);
		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			for (int i = 0; i < bk.length; i++) {
				oos.writeObject(bk[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Calendar setCalendar(int year, int month, int date) {
		Calendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR,year);
		gc.set(Calendar.MONTH,month);
		gc.set(Calendar.DATE,date);
		return gc;
	}

	public void fileRead() {
		Book[] readBook = new Book[10];
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

			int i = 0;
			while (true) {
				readBook[i] = (Book)ois.readObject();
				System.out.println(readBook[i]);
				i++;
			}

		} catch (EOFException e) {
			System.out.println(filename+"  읽기 완료!");
			return;
		} catch (FileNotFoundException e) {
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
