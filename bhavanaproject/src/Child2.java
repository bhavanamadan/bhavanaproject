
public class Child2 extends Child1 {
     public void m1() {
    	 System.out.println(super.a);
     }
     public static void main(String[] args) {
		Child2 oob = new Child2();
		oob.m1();
	}
}
