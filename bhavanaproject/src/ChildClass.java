
public class ChildClass extends CheckingConstructorOverlriding {
	  public  ChildClass (int a){
	    	System.out.println("checking constructor overriding");
	    }
	  public static void main(String[] args) {
		  ChildClass obj  = new ChildClass();
		  obj(45);
	}
}

