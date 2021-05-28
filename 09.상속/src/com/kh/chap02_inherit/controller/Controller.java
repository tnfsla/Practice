package com.kh.chap02_inherit.controller;

import com.kh.chap02_inherit.model.vo.Vehicle;

public class Controller {
	private Vehicle[] v = new Vehicle[3];
	private int count = 0;
	
	public void insert(Vehicle any) {
		v[count++] = any;
	}
	
	public Vehicle select(int index) {
		return v[index];
	}
	public Vehicle[] selectAll() {
		return v;
	}

}
