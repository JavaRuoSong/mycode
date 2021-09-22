package com.atguigu.java;


public class AbstractTest {

}
/*
 * 抽象类
 * abstract修饰类，表示该类为抽象类，不可实例化对象
 * 
 * 抽象方法只有方法的声明。没有方法体
 * 包含抽象方法的类一定是一个抽象类
 * 若子类重写了所有父类中所有的抽象方法，则子类可以实例化，若没有子类需要加上abstract修饰
 * abstract不能修饰私有方法，静态方法，final的方法，final的类。
 * 
 * 
 * */
abstract class Person{
	int age;
	String name;
	public Person() {
		
	}
	public Person(int age ,String name) {
		this.age = age;
		this.name = name;
	}
	public void eat() {
		System.out.println("人吃饭");
		
	}
	public  abstract  void sleep();
}
abstract class Student extends Person{
	
	int id;
	public Student(int id,String name,int age) {
		super(age,name);
		this.id = id;
	}
//	public void sleep() {
//		System.out.println("学生多睡觉");
//		
//	}
}