package Bhavana;

public class FactorialOfANumber {
	public static void main(String[] args) {
		int n = 4;
		int fact = 1;
		for (; n >= 1; n--) {
			fact = fact * n;
		}
		System.out.println(fact);
	}
}
