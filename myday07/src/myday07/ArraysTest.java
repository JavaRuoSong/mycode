package myday07;
import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] agrs) {
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {4,3,2,1};
		System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		Arrays.fill(arr2, 5);
		System.out.println(Arrays.toString(arr2));
	}
}
