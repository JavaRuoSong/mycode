package com.atguigu.test;



/*面向对象特征1：封装与隐藏
 * 
 * 封装性的体现之一：属性私有化；提供设置值的public方法（set();） 与 获取值的public方法（get();）
 * ：不对外暴露的私有性方法（内部使用），构造器私有化，单例模式；
 * 
 * 设计程序追求“高内聚，低耦合”：
 * 		隐藏对象内部复杂性，只对外公开简单的接口，便于外界调用，从而提高系统的可扩展性，可维护性
 * 			（通俗的来说，该隐藏的隐藏，该暴露的暴露。这就是封装性的设计思想）
 * Java四个权限修饰符（从小到大），private（内部类），缺省【default】（包内），protected（不同包的子类），
 * public（统一工程内）
 * ！！calss的修饰符只能是public与缺省（default）
 * 
 * 	
 * 
 * 
 * */
public class ValueTransferTest {
	public static void main(String[] args) {
	Animal animal = new Animal();
		animal.show();
		
		
		 
		
	}
}
class Animal{
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
		System.out.println(name+" "+age+" "+legs+" ");
	}

}
