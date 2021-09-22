package com.atguigu.exer;

public class InterfanceTest {
	public static void main(String[] args) {
		CompareCircle c1 = new CompareCircle(5);
		CompareCircle c2 = new CompareCircle(6);
//		c1.setRadius(5);
//		c2.setRadius(5);
		System.out.println(c1.compareTo(new String("aa")));
	}
}
