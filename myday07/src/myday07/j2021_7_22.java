package myday07;

public class j2021_7_22 {
	public static void main(String[] agrs) {
		//数组中初始化值 引用数据类型为null int：0 boolean：false 浮点型：0.0
		int[][]arr = new int[10][];
		
		for(int i = 0;i<arr.length ;i++) {
			arr[i] = new int[i+1];
			arr[i][i] = arr[i][0] = 1;
//		for(int i = 0;i<arr.length ;i++) {
			for(int j = 1;j<arr[i].length-1 ;j++) {
	//			arr[i][i] = arr[i][0] = 1;写在外层循环下，否则arr[0],arr[1].length-1
	//									  为0，1，无法进入循环
				arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
			}
		}
		
		
		
		for(int i = 0;i<arr.length ;i++) {
			for(int j = 0;j<arr[i].length ;j++) {
				System.out.print(arr[i][j]+"      ");	
			} 
			System.out.println();
		}
		
		
		
	}
}
