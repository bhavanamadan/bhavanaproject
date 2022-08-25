import java.util.Scanner;
public class ToCheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			if(num%2!=0||num ==2)
			
				System.out.println(num + " it is a prime number");
			else 
				System.out.println(num + " it is a composite number");
		}
			
	}



