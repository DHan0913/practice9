package com.javaex.ex03;

public class Goods {

	private String name;
	private String price;
	private int count;

	public Goods(String name, String price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return name + "(가격:" + price + "원)이 " + count + " 개 입고 되었습니다.";
	}

}
