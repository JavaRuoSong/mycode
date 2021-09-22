package com.atguigu.mydya08;
/*
 * 一。设计类，其实就是设计类的成员
 * 
 * 
 * 属性= 成员变量 = filed = 域，字段
 * 方法 = 成员方法 = 函数 = method
 * 
 * 
 * 
 * 创建类的对象 = 类的实例化 = 实例化类
 * 
 * 二、类和对象的使用（面向对象思想落地的实现）
 * 	1.创建类，设计类的成员
 *  2.创建类的对象
 *  3.通过“对象.属性” “对象.方法”调用对象的结构
 * 
 * 
 * 三、设计类：设计类的成员（属性，方法）
 * 
 * 
 * 
 * */
//测试类
public class PersonalTest {
	public static void main(String[]args) {
		//创建person类的对象 == 类的实例化
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = p1;//栈空间声明
		
		//调用类的结构：属性，方法
		
		//调用属性:"对象.属性"
		p1.name = "Tom";
		p1.age = 15;
		p1.isMale = true;
		
		//调用对象：对象名.方法
		 p1.eat();
		 p1.sleep();
		 p1.talk("chinese");
		 p3.talk("chinese");
		 p3.age = 15;
		 System.out.println(p3.age);
		 
	}
}


class Person{
	//属性
	String name;//还未赋值 null
	int age = 99;
	boolean isMale;//默认false
	
	//方法
	public void eat(){
		String food = "包子";//局部变量
		System.out.println("人爱吃"+food);
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
	
	public void talk(String language/*形参也是局部变量*/) {
		System.out.println("说的是："+language);
	}
	
	
	
	
	
	
	
	
	
}