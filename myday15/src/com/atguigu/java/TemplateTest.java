package com.atguigu.java;
/**
 * 模板方法  创造一个抽象方法，在抽象类的子类中 重写抽象方法
 * @author Administrator
 *
 */
public class TemplateTest {
	public static void main(String[] args) {
		  new primeNum().spendTime();
	}

}
abstract class Template{
	
	public void spendTime() {
		long start =  System.currentTimeMillis();
		code(1000);//不确定的部分
		long end = System.currentTimeMillis();		
		System.out.println("花费的时间"+(end-start));
	}
	
	
	
	public abstract void code(int i) ;
	
}
class primeNum extends Template{
	public void code(int i) {
		for(int m = 2;m<i;m++) {
			boolean flag = true;
			for(int n =2;n<Math.sqrt(m);n++ ) {
				if(m%n == 0) {
					flag = false;
					break;
					
				}
//				if(flag) {
//					System.out.println(m);
				}
				if(flag) {
					System.out.println(m);
			}
		}
	}
}