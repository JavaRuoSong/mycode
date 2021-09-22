package com.atguigu.exer2;

import org.junit.Test;

//JUnit单元测试
/*
 * 步骤：
 * 1.选中当前工程-右键选择：build path -》add libraries - JUnit 4 -下一步
 * 2.创建Java类，进行单元测试。
 * 		要求：1.此类是公共的，2.此类提供一个公共的无参构造器
 * 3.此类中单元测试方法：
 * 		要求：方法是public 的，没有返回值，没有形参
 * 
 * 4。此单元测试方法需要声明注解：@Test,并在单元测试类中导入：import org,junit.Test;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class JUnitTest {
@Test
public void test() {
	//基本数据类型转为string类
	int num = 10;
	String str = num+"";
	System.out.println(str);
	double d1 = 13.3;
	String s2 = String.valueOf(d1);
	System.out.println(s2);
}
@Test
public void test1() {
	//string类型转为基;本数据类型
	String s1 = "123";
	int num1 = Integer.parseInt(s1);
	System.out.println(s1);	
}
@Test
public void test2() {
	//基本数据类型与包装类之间的转化
	Integer i1 = new Integer(5);
	int a = i1;
	System.out.println(a);
	int b = 5;
	Integer i2 = b;
	System.out.println(i2);
	//自动拆装箱
	
}
@Test
public void test3() {
	Object o1 = true ? new Integer(1):new Double(2.0);
	System.out.println(o1);
	
	Object o2 = "dfgd";
	System.out.println(o2);
	
}

}
