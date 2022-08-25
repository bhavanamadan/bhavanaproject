
public class Child1 extends Parent1 {
	int a = 56;
	
	 void m1(double b) {
		System.out.println(super.b);
		System.out.println(Parent1.a);		
	}
    public  void m2() {
    	System.out.println("M4 METHOD");
    	System.out.println(super.a);
    	System.out.println(super.b);  	
   }
    public static void main(String[] args) {
   Child1 obj= new Child1();
    System.out.println(obj.a); 
   obj. m1(34);
  
    }
}