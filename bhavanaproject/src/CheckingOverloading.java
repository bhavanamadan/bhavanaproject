
public class CheckingOverloading extends  OverLoadingInheritedCLass {
	
	public void m1(int a , boolean c) {
		
		System.out.println("checking overloading");
	}
    public void m1(double a) {
    	System.out.println("m1 get overloaded ");
    }
    public static void main(String[] args) {
    	CheckingOverloading	obj= new CheckingOverloading();
    	obj.m1(34,true);
    	obj.m1(34.89);
	}
    }
