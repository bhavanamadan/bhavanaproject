import java.util.Scanner;
public class WhileLoop {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		long n = sc.nextLong();
		
		long fact = 1 ;
		long i = 1;
		while( i <= n) {
			
			
			fact = fact*i;
			i++;
			
		}
		System.out.println(fact);
		
	}
		
	}
	
	


