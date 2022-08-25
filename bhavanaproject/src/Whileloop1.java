
public class Whileloop1 {
	public static void main(String[] args) {
		int numbertocheck = 371;
		int result = 0;
		int temp = numbertocheck;
		while (temp != 0) {
			int rem = temp % 10;
			result = result + (rem * rem * rem);
			temp /= 10;
		}
		if (result == numbertocheck)
			System.out.println(numbertocheck);

	}
}
