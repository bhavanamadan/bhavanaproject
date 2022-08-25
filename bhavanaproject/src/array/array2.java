package array;

public class array2 {
	public static void main(String[] args) {
		int a[] = { 12, 45, 56, 77, 88, 89, 56, 34 };
		int empty;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					empty = a[i];
					a[i] = a[j];
					a[j] = empty;
				}

			}

		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i] + " ");

	}
}
