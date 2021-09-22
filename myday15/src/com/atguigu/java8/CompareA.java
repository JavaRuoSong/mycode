package com.atguigu.java8;
/*
 * 
 * jdk8:接口中除了可以定义全局常量和抽象和方法外，还可以定义静态方法，默认方法
 * 接口可以继承接口 ，可以实现类
 * 抽象类实现接口
 * 
 * 
 * */
public interface CompareA {
	
	//静态方法
	public static void method1(){
		System.out.println("CompareA:北京");
	}//挺像类的
	
	//默认方法
	public default void method2(){
		System.out.println("CompareA:上海");
	}
	//默认方法
	default void method3() {
		
	}
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
