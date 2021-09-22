package com.atguigu.test;

public class animal1 {
	String name;
	int age;
	
	//属性私有化（体现封装）
	private int legs;
	//设置legs 不需要返回值 有形参
	public void setLegs(int i) {
		if(i>=0&&i%2==0) {
			legs = i;
		}
	}
	//返回legs 有返回值 不需要形参
	public int getLegs() {
		return legs;
	}
	
	
	//
	public void show() {
		System.out.println(name+" "+age+"岁 "+legs+"条腿 ");
	}



//构造器   权限修饰符 类名(形参列表){}
	public animal1() {
		//System.out.println("animal1..........");
		age = 18;
	}
	public 	animal1(String n, int a) {
		name = n;
		age = a;
	}
	//构造器的重载
	public animal1(String n) {
		name = n;
	}
}