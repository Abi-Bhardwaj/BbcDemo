package corejava;

public class SuperClass {

	private String str = "Private String";

	public String callPrivateVariable() {
		return str;
	}

	public SuperClass() {
		System.out.println("This is default constructor");
	}

	SuperClass(int a) {
		System.out.println(a);
	}

	public static void multiply() {
		System.out.println("Multiplication is: " + 5 * 5);
	}

	public void add() {
		int x = 5 + 5;
		System.out.println("Addition is: " + x);
	}

	public void sub() {
		int x = 5 - 5;
		System.out.println("Substraction is: " + x);
	}

	public static void main(String[] args) {
		System.out.println("This is Super class");
		SuperClass sup = new SuperClass();
		SuperClass sup_2 = new SuperClass(10);
		sup.add();
	}

}
