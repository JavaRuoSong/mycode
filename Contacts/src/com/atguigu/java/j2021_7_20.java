package com.atguigu.java;

public class j2021_7_20 {
	static void perfectNum(){
	//	int sum = 0;
		for(int i = 1;i<=10;i++) {
			int sum = 0;
			for(int j=1;j<i;j++) {
				if(i%j ==0) {
					sum +=j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
	static void three(int i) {
		
		for(int a =0;a<i;a++) {
			
			for(int j=0;j<6-a;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void main(String[]args) {
		long start = System.currentTimeMillis();
	/*	System.out.println("hello");
		long end = System.currentTimeMillis();
		System.out.println(start - end);           */
	//	perfectNum();
	/*	int sum = 0;
		for(int i = 1;i<=1000;i++) {
			for(int j=1;j<=i/2;j++) {
				if(i%j ==0) {
					sum +=j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
			 sum = 0;
		}
		long end = System.currentTimeMillis();
		System.out.println(-start + end);*/
		three(6);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
