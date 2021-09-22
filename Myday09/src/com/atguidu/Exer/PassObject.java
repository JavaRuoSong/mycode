package com.atguidu.Exer;



public class PassObject {
	
	
	public void printAreas(Circle c,int time) {
		Circle c1 = new Circle();
		for(int i = 1;i<time+1;i++) {
			c1.radius = i;
			System.out.println(i+"半径的圆面积为："+c1.findArea());
		}
		System.out.println("当前半径为："+c1.radius);
	}
}
