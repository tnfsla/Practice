package com.kh.chap01_list_part02_list.model.vo;

import java.util.Objects;

public class Music {
	
	private String title;
	private String artist;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}
	
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Music [ title : "+title+" , artist : "+artist+" ]";
	}

	@Override
	public int hashCode() {  // 해쉬코드오버라이딩
		// TODO Auto-generated method stub
		return (title+artist).hashCode();
	}

	@Override
	public boolean equals(Object obj) { // 기존 String은 1개 종류만 있으니까 그거만 비교하면 되었지만, 객체의 equals를 이용하기위해서는 모든 변수들이 같은지를 확인해야하기 때문에
										// 오버라이딩해서 수정해야함.
		
		if(!(obj instanceof Music))
			return false;
		
		Music other = (Music)obj;
		
		if(this.title.equals(other.title) && this.artist.equals(other.artist))
			return true;
		else return false;
	}
	
	
	
	

}
