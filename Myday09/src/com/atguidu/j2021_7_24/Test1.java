package com.atguidu.j2021_7_24;



/*1.万事万物皆对象：
 * 		1.在java语言范畴中，我们将功能，结构等封装到类中，通过类的实例化，来调用类中的功能结构。
 * 			Scanner,String类等
 * 			文件：File
 * 			网络资源：URL
 * 		2.涉及到Java语言与前端HTML，后端数据库交互时，前后端结构在Java层面交互时，都体现为类，对象
 * 引用数据类型变量只可能存储两类值：null 或地址值（含变量类型）
 * 
 * 
 * 方法参数的值传递机制
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
public class Test1 {
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.show( 12  );
		test.show( "sss");
		test.show("vbdfbvdfb","vsdvs");
		
		
	}
	
	public void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
	}
	public void second(Value v ,int i) {
		
	}
	
	
	
	//可变个数格式的形参:数据类型，变量
	//当调用可变形参个数的方法时，传入参数个数可以是任意个。
	/*可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载。
	 * 可变个数形参的方法与本类中方法名相同，形参相同的方法之间不构成重载。换言之，二者不能共存
	 * 可变个数形参在方法的形参中，必须声明在末尾。（最多只有一个）
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public void show(int i) {
	
	}
	
	
	public void show(String s) {
		
	}
	
	public void show(String ...strs) {
		
	}
	
	
	
}




