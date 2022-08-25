package String;

import java.util.Arrays;

public class CheckingTwoArraysAreEqual {
	public static void main(String[] args) {
		int[] a1 = { 12, 23, 45 };
		int[] c1 = { 12, 23, 45 };
		int[] b1 = { 23, 45, 56, 66 };
		System.out.println(Arrays.equals(a1, b1));
		System.out.println(Arrays.equals(a1, c1));

	}

}
