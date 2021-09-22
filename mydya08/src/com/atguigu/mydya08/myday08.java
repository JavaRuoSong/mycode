package com.atguigu.mydya08;

public class myday08 {
	public static void main(String[]args) {
	/*一旦程序出现异常，就终止执行。
	 * 面向对象三条主线：
	 *1.Java类及类的成员：属性，方法，构造器：  代码块，内部类 
	 *2.面向对象三大特征：封装性；继承性，多态性（抽象性）
	 *3.其它关键字：this,super,static,final,abstract,interface,package,import
	 * 
	 * 面向过程：强调的是功能行为，以函数为最小单位，考虑怎么做，
	 * 面向对象：将功能封装进对象，强调具备了功能的对象，以类/对象为最小单位，考虑谁来做。
	 * 
	 * 
	 */	

			System.out.println(getFen(90));//	getFen(90);
		    }
			public static char getFen(int a)
		        {
				if(a<=100&&a>=90){
					return 'A';
				}
				else if(a<90&&a>=70){
					return 'B';
				}
				else if(a<70&&a>=60){
					return 'c';
				}
				else
					return 'D';
		        }
			
}
