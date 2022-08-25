
public class CheckingStackOverFlowForConstructor {

	 CheckingStackOverFlowForConstructor() {
		this(45);
	}
	 CheckingStackOverFlowForConstructor(int a){
		 this();
		 System.out.println("java course");
	 }
	public static void main(String[] args) {
	  new CheckingStackOverFlowForConstructor(34);
	}
	
	
}
