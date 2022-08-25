
public class FibonacciSeries1 {

	public static void main(String[] args) {
		int num1 = 1;int num2 = 1; int nextterm;
		for(int i = 1; i<=4; ++i) {
			System.out.println(num1);
		nextterm = num1 + num2;
		num1 = num2;
		num1= nextterm;
	}
	}                                           //   0 1
     }                                                //0+1=1
//0 1 1 2 3 5                                           //1+1=2