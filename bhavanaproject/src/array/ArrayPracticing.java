package array;

import java.util.Arrays;

public class ArrayPracticing {
	public static void main(String[] args) {
		int[] a = { 12, 45, 2, 45, 'u', 89, 76 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}