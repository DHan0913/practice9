package com.javaex.ex04;

public class RectTriangle extends Shape   {
    private double width;
    private double height;
	
    public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}
    
    @Override
	public double getArea() { // 넓이
	return width*height/2;
    }
	@Override
    public double getPerimeter() { // 둘레 길이
	return width+height+Math.sqrt(width*width+height*height);
    

	}
}