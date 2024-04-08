package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;
	
    public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		width = s*this.width;
		height = s*this.height;
		
	}
	public double getArea() {
		return width*height;
	} // 넓이

	
	@Override
    public double getPerimeter() {// 둘레 길이
	return (width+height)*2;
	}
}