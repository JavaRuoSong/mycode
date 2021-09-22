package com.atguigu.java;

public class Cylinder extends Circle{
	private double length;
	public Cylinder () {
		this.length  = 1;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double findVolume() {
		return super.findArea()*length;
		
	}
	
	public double findArea() {
		return super.findArea()*2+getRadius()*2*Math .PI;
	}
	
	
	
	
}
