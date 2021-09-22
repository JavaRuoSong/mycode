package myday07;

public class find {
	public static void main(String[]args) {
		int[]arr = new int[] {-985,-151,-41,-35,0,45,99,987,999};
		int dest = 45;
		int head = 0;
		int end = arr.length-1;
		boolean flag = true;
		while(head<=end) {
			if(dest== arr[(head+end)/2]) {
				System.out.println("索引位置为："+(head+end)/2);
				flag = false;
				break;
			}else if(dest>arr[(head+end)/2]) {
				head = (head+end)/2+1;
			}else if(dest<arr[(head+end)/2]) {
				end = (head+end)/2-1;
			}	
		}
		
		if(flag) {
			System.out.println("没有找到");
		}
	}//18903475998存钱电话
}
