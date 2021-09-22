package gengyi;

import com.atguigu.test.animal1;

public class Meme {
	public static void main(String[] args) {
		//创建类的对象 new + 构造器
		/*
		 * 构造器作用：
		 * 1.创建对象
		 * 2.初始化对象信息
		 * 
		 * 一旦显示的定义了构造器，系统就不再提供默认空参构造器
		 * 一个类中至少有一个构造器
		 * 
		 * */
		animal1 a = new animal1();
		
		animal1 animal = new animal1("TOM",15);
		animal.setLegs(6);
		animal.getLegs();
		animal.show();
	}
}
