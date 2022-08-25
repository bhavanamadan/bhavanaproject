
public class CheckingStackOverFlow {
	
	void m1() {
		m2();
		System.out.println("bhavana");
	}
	void m2() {
		m1();
		System.out.println("ruksu");
	}
	
	public static void main(String[] args) {
		System.out.println("Say Hello Java");
	
		CheckingStackOverFlow obj =	new CheckingStackOverFlow();
	    obj.m2();
	    
	
	}	

}
