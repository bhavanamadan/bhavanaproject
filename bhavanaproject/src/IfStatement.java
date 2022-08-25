import java.util.Scanner;
public class IfStatement 
{
public static void main(String args[])
 {   
	System.out.println("enter a number");
    Scanner sc  =  new Scanner(System.in);
	int a = sc.nextInt();

	if(a%2==0)
		
	{	
	System.out.println("it is an even number");
	}else
	
	{
	System.out.println("it is an odd number");
	}
	
 }
}
 