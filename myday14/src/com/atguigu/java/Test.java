package com.atguigu.java;
/*
 * 代码块：
 * 	1.作用：用来初始化类，对象
 * 	2.代码块如果有修饰的话，只能用static
 * 	3.分类：静态代码块vs非静态代码块
 * 
 * 
 * 	4.静态代码块
 * 		内部可以有输出语句
 * 		随着类的加载而加载
 * 
 * 	5.非静态代码块
 * 		内部可以有输出语句
 * 		随着对象创建而执行
 * 		每创建一个对象执行一次非静态代码块
 * 		作用：可以在创建对象时对对象的属性进行初始化
 * 
 * 
 * 对属性可以赋值的位置
 * 
 * 	默认
 * 	显式
 * 	构造器
 * 有了对象后通过 对象.属性 对象.方法 进行赋值
 * 	在代码块中赋值
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * **/
public class Test {
	public static void main(String[] args) {
		
		
		String desc = person.desc;
		
		
		
		
//		person p = new person();
//		person p1 = new person();
	}
	
	
	
	
	
}
class person{
	String name;
	int age;
	static String desc = "我是一个人";
	public person() {
		
	}
	//static代码块
		static {
			System.out.println("hello,static block");
		}
		//非static代码块
		{
			System.out.println("hello,block");
		}
		
		//方法
}
