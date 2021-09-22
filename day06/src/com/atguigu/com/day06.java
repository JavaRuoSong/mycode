package com.atguigu.com;
import java.util.Scanner;

public class day06 {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);

		// 数组静态初始化
		// int [] arr;
		int[] arr = new int[] { 1001, 1002, 1003, 1004 };

		// 动态初始化，赋值和初始化分开操作

		String[] names = new String[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素");
			arr[i] = scan.nextInt();
		}
		System.out.print("该数组为 ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		scan.close();
//		int [] arr = nre int [];
//		System.out.print(arr[0]+" ");

	}
}
