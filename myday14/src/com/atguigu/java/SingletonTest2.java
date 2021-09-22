package com.atguigu.java;

public class SingletonTest2 {
	public static void main(String[] args) {
		Order o1 = Order.geto1();
	}
	
}
//单例模式懒汉式实现
class Order{
	//
	private Order() {
		
	}
	//
	private static Order o1 = null;
	
	//3.
	public static Order geto1() {
		if(o1 == null) {
			o1 = new Order();
					
		}
		return o1;
	}
	
}