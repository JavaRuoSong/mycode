package com.atguigu.java;

public class Circle{
	public static void main(String[] args) {
		
	
		Circle1 c1 = new Circle1();
		Circle1 c2 = new Circle1();
		
		System.out.println(c2.getId());
	
	}
}





 class Circle1 {
	private double radius;
	private int id;
	
	private static int count;
	private static int init = 1001;
	
	
	public Circle1(){
		id = init++;//创建时赋值1001 每创建一次就++
	}
	
	
	public static int getCount() {
		return count;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public int getId() {
		return id;
	}


	


	public double findArea() {
		return Math.PI*radius*radius;
	}
	
}
