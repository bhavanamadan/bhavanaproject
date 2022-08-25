package array;

public class array6 {
	public static void main(String[] args) {
		String s = "welcometojava";
		for (int i = 0; i < s.length() - 2; i++) {
			for (int j = i; j <= (i + 2); j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}

	}

}
