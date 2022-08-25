package Bhavana;

public class GoodProgramming {
	
	public  int sum1(int num1, int num2){
		System.out.println(sum1(23,56));
		return num1+num2;	
	}
	public  double sum(double num1, int num2){
		sum1(23,56);
		return num1+num2;
		
	}

	public static void main(String args[]) {
		
	 // System.out.println(sum(23,45));
		GoodProgramming obj = new GoodProgramming();
		obj.sum(34.56, 67);
	
}

}