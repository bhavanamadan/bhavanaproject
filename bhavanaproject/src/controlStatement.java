import java.util.Scanner;
public class controlStatement
{
public static void main(String args[])
{
	System.out.println("ENTER A NUMBER");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int sum;
	sum = (a*(a+1))/2;
	System.out.println("SUM OF THE GIVEN NATURAL NUMBERS UPTO  GIVEN NUMBER IS :" +sum);
    if(sum%2==0)
    {
    	System.out.println("SUM OF THE NATURAL NUMBERS UPTO GIVEN NUMBER IS EVEN");
    }
    else {
    	System.out.println("SUM OF THE NATURAL NUMBERS UPTO GIVEN NUMBER IS ODD");
    }
}
}
