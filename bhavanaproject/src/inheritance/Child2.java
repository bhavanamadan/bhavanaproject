package inheritance;

public class Child2 extends Child1 {
	int a = 34;
	
	public void m2() {
		//System.out.println(kk.a);
		System.out.println(a);
		System.out.println(super.a);
		System.out.println("p2");
		
	}
public static void main(String[] args) {
	
	Child2 ch = new Child2();
	Parent ck = new Parent();
	ch.m1();
	ck.m3();
	Parent.m4();//class name .method name
	ch.m2();
	
}
}
