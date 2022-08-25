
public class ChildConstructor extends ParentConstructor {
	public ChildConstructor() {
		System.out.println("childconstructor ");
	}
	public static void main(String[] args) {
		new ChildConstructor(34);
	}
}
