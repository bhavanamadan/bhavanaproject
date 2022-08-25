package Tprogram;

import java.util.Scanner;

public class SumOfDigitOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
			for( ; num!=0; num/=10 )
			{
				//sum+=num%10;
				sum = sum +num%10;
			}
		System.out.println("SUM OF DIGITS OF A NUMBER IS : "+ sum);
	}
}

