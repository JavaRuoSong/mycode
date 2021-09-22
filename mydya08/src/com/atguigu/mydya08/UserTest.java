package com.atguigu.mydya08;



/*
 * 类中属性使用
 * 
 * 
 * 属性（成员变量）  vs 局部变量
 * 
 * 1.相同点：
 * 			 格式：数据类型 变量名 = 变量值
 * 			 先声明，后使用
 * 			 都有其对应的作用域
 * 
 * 2.不同点
 * 		1.	 定义的位置不同
 * 			 属性：直接定义在类的{}内
 * 			 局部变量：声明在方法内，方法形参，代码块内,构造器形参，构造器内部的变量
 * 		2. 关于权限修饰符的不同
 * 			 属性：可以声明属性时，指明其权限，使用权限修饰符。
 * 			 常用的权限修饰符：private，public，缺省，protected ------》封装性
 * 			 局部变量：不可以使用权限修饰符。
 * 		3.默认初始化值：
 * 			 属性：0 0.0 null false
 * 			 局部变量：没有初始化值
 * 					意味着声明时必须赋值
 * 					特别的：形参使用时赋值
 * 		4.内存中加载位置不同：
 * 			属性：在堆空间中（非static）
 * 			局部变量：加载到栈空间
 * 
 * 
 * 
 * 方法：类应该具有的功能。
 * 		比如：Math类：sqrt()//random()
 * 			Scanner类：nextXXX()
 * 	声明：
 * 		void：没有返回值、
 * 	 有返回值：
 * 		比如 String：返回字符串  double：返回浮点型
 * 	 方法声明格式：权限修饰符 返回值类型 方法名(形参列表){
 * 						方法体
 * 				}
 * 		注意：static，final;abstract 关键字来修饰的方法，后面讲
 * 	
 * 		方法的权限修饰符：
 * 			Java规定的四种权限修饰符：private，public，缺省，protected
 * 				private：私有的，结构外无法调用
 * 		方法的返回值：
 * 			1.如果有返回值，必须在方法声明时指定返回值的类型，同时，
 * 		  	在方法中使用return关键字来返回指定类型的变量或常量。
 * 			2.没有返回值时通常不使用return，特殊只能在结束时使用 return;后面不可以
 * 			有表达式，表示方法结束。
 * 
 * 
 * 			定义方法时该不该有返回值？
 * 				1.题目要求
 * 				2.经验
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
 * 
 * 
 * 
 * 
 * 
 * */

public class UserTest {
	public static void main(String[]args) {
		Customer c1 = new Customer();
		String a = c1.eat("包子");
		User u1 = new User();
		System.out.println(a);
	}
	
}


 class User{
	
	
}
 class Customer{
	 String name = "Tom";
	 int age;
	 boolean isMale;
	 
	/*private*/ 
	 public String eat(String food) {
		 String fan = name+"爱吃"+food;
		 return fan;
		  
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }