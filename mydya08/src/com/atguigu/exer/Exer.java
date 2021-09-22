package com.atguigu.exer;

public class Exer {
	public static void main(String[] args) {
	/*	method1 f1 = new method1();
		f1.chang = 10;
		f1.kuan = 8;
		f1.dayin();
		double a1 = f1.area();
		System.out.println(a1);*/
		Exer test = new Exer();
		System.out.println(test.method(10, 8));
		
		
		
	}
	/**
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public  int method(int m ,int n) {
		for(int i = 1;i<m;i++) {
			for(int j = 1;j<n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		return m*n;
	}


}




class method1 {
	int chang;
	int kuan;
	
	public void dayin() {
		for(int i = 1;i<chang+1;i++) {
			for(int j = 1;j<kuan+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public int area () {
		return chang*kuan;
	}
}