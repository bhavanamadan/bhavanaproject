package demo;

public class PrintingSumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for(int n =1;n<=1000;++n) {
			if(n%2==0) {
		sum += n;
		System.out.println(sum);
			}
		//sum = sum+n
	}	
		//System.out.println("THE SUM OF NUMBERS FROM 1 TO 1000 IS : " +sum);
	}
}
