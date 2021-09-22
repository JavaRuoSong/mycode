package com.atguigu.exer;

public class Test {
	public static void main(String[] args) {
		Animal a1 = new Dog();//dog是Animal类型的，不可调用子类中特有的方法
		a1.eat();
	//	a1.shout();//The method shout() is undefined for the type Animal
	//有了多态性以后，内存中加载了子类中特有的方法，由于变量声明为父类类型，导致编译时，只能调用父类中
	//声明的属性和方法。子类特有的属性和方法不能调用
	//子类转父类：
		Dog d2 = new Dog();
		Animal a2 = d2;
		a2.eat();
		
		//如何调用子类中特有的属性和方法
		Dog d1 = (Dog)a1;//强制类型转换  ！！强制转型 
		//向上转型：多态 （父类变为子类） 
		d1.shout();
		d1.eat();
	//instanceof关键字
		//a instanceof A  :判断a是否是类A的实例。如果是返回true 不是返回false。
		//Cat c1 = (Cat)d1;//Cannot cast from Dog to Cat
		//避免向下转型是出现异常，向下转型时使用instanceof 判断，返回true 向下转型
		Cat c1 = new Cat();
		c1.climb();

	if (a1 instanceof Cat) {
		Cat c2 = (Cat)a1;
		System.out.println("**********cat********");
	}
	if(a1 instanceof Dog) {
		//向下转型:a1(Animal类型)转为Dog类型
		Dog d5 = (Dog)a1;
		System.out.println("************dog**********");
	}
	
	Object obj = new Dog();
	Animal dd1 = (Animal )obj;
	//内存中加载过 Animal就可以转换（创建子类对象是内存中就加载过父类的属性和方法）
	System.out.println(d2.getClass());
	}
}
