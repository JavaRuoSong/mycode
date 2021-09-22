package com.atguigu.java;

/*
 * 区分饿汉式和懒汉式
 * 	饿汉式：
 * 		坏处：对象加载时间过长。
 * 		好处：线程安全
 * 	懒汉式：（用时创建对象）
 * 		好处：延迟对象的创建。
 * 		坏处：目前写法线程不安全-------》多线程时，再修改
 * 
 * 
 * */

public class SingletonTest1 {
	public static void main(String[] args) {
		Bank b1 =Bank.gteb1();
		
	}	
}
//单例模式
//饿汉式
class Bank{
	//1.私有化类的构造器
	private Bank() {
		
	}
	//2.内部创建类的对象必须是静态的
	private static Bank b1 = new Bank(); 
	
	//提供方法返回对象
	public static  Bank  gteb1() {
		return b1;
		
	}
}
