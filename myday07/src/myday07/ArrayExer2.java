package myday07;

public class ArrayExer2 {
	public static void main(String[]args) {
		int []arr1 =  new int[] {2,3,5,7,11,13,17,19};//在堆空间中开辟了一块空间，arr1指向他
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		int[] arr2 = arr1;//arr1和arr2地址值相同，都指向堆空间中唯一一个数组实体
		for(int i = 0;i<arr1.length;i++) {
			if(i%2==0) {
				arr2[i] = i;
			}
		}
		//arr1和arr2地址值相同，都指向堆空间中唯一一个数组实体
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}
	
}
