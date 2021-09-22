package com.atguigu.java8;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s1 = new SubClass();
//		s1.method1;  
		/*1.接口中定义的静态方法只能通过接口调用
		 * */
		CompareA.method1();
		//2.通过实现类的对象，调用接口中的默认方法
		//  如果实现类重写了接口中的方法，调用时执行重写后的方法
		s1.method2();
		//3.如果子类或实现类继承的父类和实现的接口中声名了同名同参数的方法
		//那么子类在没有重写此方法的情况下，默认调用父类中同名同参数的方法
		//多个接口声名同名同参方法，而且实现类中没有重写该方法，！！报错
		s1.method3();
		
	}
}
class SubClass extends SuperClass implements CompareA{
	@Override
	public void method2() {
//		// TODO Auto-generated method stub
//		CompareA.super.method2();
		System.out.println("重写的method2");
	}
	public void myMethod() {
		method2();
		super.method3();
		//调用接口中的默认方法
		CompareA.super.method3();
	}
}