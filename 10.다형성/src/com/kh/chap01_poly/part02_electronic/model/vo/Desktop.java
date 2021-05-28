package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{
	public final static String CPU = "intel";   // 표에서 알려줄때 밑줄 => static , 대문자 => final
	private String graphic;
	
	public Desktop() {
		// TODO Auto-generated constructor stub
	}

	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
		// TODO Auto-generated constructor stub
	}
	
	public static String getCpu() {
		return CPU;
	}

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", CPU : "+CPU+", graphic : "+graphic;
	}
	
	

}
