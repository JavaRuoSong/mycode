package com.atguigu.com;

public class ArrTest {
	public static void main(String[] agrs) {
		int[] arr = new int[5];
		// System.out.println(arr[2]);
		char[] arr1 = new char[5];// 输出0
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");// 输出0不是'0'
		}
		System.out.println();
		if (arr1[0] == 0) {
			System.out.println("arr1[0] == 0");
		}

		double[] arr2 = new double[5];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");// 0.0
		}
		System.out.println();

		boolean[] arr3 = new boolean[5];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr3[i] + " ");// false
		}
		System.out.println();

		String[] arr4 = new String[5];
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");// 默认值null
		}
		System.out.println();
		
		/*
		 * 栈：stack(局部变量：方法中的变量) 
		 * 堆：heap(new出来的结构：对象，数组)
		 *  方法区(常量池，静态域)
		 * 18013820100
		 */

	}
}
