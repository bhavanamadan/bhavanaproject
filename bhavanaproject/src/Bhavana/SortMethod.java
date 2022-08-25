package Bhavana;

import java.util.Arrays;

public class SortMethod {
	public static void main(String[] args) {
		int a[] = { 12, 34, 56, 78, 1, 89 };
		Arrays.sort(a);
		System.out.println("sorting of an array in Ascending order ");
		for (int i = 1; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("sorting of anarray in descending order");
		for (int i = a.length - 1; i >= 1; i--) {
			System.out.println(a[i]);
		}

	}
}
