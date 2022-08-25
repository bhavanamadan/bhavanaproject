package inheritance;

public class Parent extends Child1 {
	int a = 45;
public void m3() {
	
	
	System.out.println("parent class");
	System.out.println(super.a);
	System.out.println(a);
}
	public  static void m4() {
		System.out.println("multilevel inheritance");
	}
	public static void main(String[] args) {
		Parent obj = new Parent();
		Child1 kk= new Child1();
		
		obj.m1();
		obj.m3();
		m4();
		System.out.println(obj.a);
		//System.out.println(kk.a);
		obj.m1();
	}
}
