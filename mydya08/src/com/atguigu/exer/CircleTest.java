package com.atguigu.exer;

public class CircleTest {
	public static void main(String[] args) {
		Circle round1 = new Circle();//对象的实例化
		round1.r = 6.8;
		System.out.println(round1.area()/*对象名.方法名调用方法*/);
}
}

class Circle{
	double r;
	
	public double area() {
		return r*Math.PI*r;
		
	}
}