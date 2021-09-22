package com.atguigu.exer1;

import org.junit.Test;

/*
 * equals与 == 的区别
 * 
 * ==：运算符：
 * 1.可以使用在基本数据类型变量和引用数据类型变量中。
 * 2.如果是比较基本数据类型变量，比较两个变量保存的值是否相同。（类型不一定相同）
 * 3.引用数据类型比较地址值（即两个引用是否指向同一个对象实体）
 * 
 *  equals()方法使用:
 *  1.是一个方法，而非运算符
 *  2.适用于引用数据类型
 * public boolean equals(Object obj) {
        return (this == obj);
    }
 * 		说明：object类中的equals方法与==的作用是相同的，比较地址值
 * 		！！String ，Date，File ，包装类等都重写了equals 方法，比较的不是地址值，而是堆空间中的
 * 			实体内容。
 * 3.通常自定义类使用equals(),也是比较实体内容，所以需要重写方法。
 * 
 * 
 * 
 * 
 * */
public class EqualsTest {
	@Test
	public void tast() {
		
	}
	
	
	public static void main(String[] args) {
		char a = 65;
		char A = 'A';
		System.out.println(a == A);//true
		
		String str = new String("string");
		String str1 = new String("string");
		System.out.println(str == str1);//false
		System.out.println(str1.equals(str1));//true
		Circle c1 = new Circle();
		c1.area = 5;
		c1.name = "圆";
		Circle c2 = new Circle();
		c2.area = 5;
		c2.name = "圆";
		System.out.println(c1.equals(c2));//true,此时调用的是Circle中重写的equals方法。
		//判断c1是否是circle的实例、
		System.out.println(c1 instanceof Circle);
		java.util.Date d1 = new java.util.Date(154624L);
		java.util.Date d2 = new java.util.Date(154624L);
		System.out.println(d1.equals(d2));//true
		System.out.println(c1);
		
		
	}

}
