package com.atguigu.test;
/*
 * Java值传递机制，基本数据类型传递具体指；引用数据类型传递地址值
 * 
 * 匿名对象只能调用一次：new 类名().方法名();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class GengYi {
	public static void main(String[] args) {
		PhoneMall mall = new PhoneMall();
		mall.show(/*匿名对象*/new Phone());
		
		
	}
}
class PhoneMall{
	public void show(Phone phone) {
		phone.sendemail();
	}
}
class Phone{
	public void sendemail() {
		System.out.println("发送邮件");
	}
}