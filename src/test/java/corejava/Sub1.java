package corejava;

public class Sub1 extends SuperClass {

	Sub1() {

	}

	public static void main(String[] args) {

		Sub1 sub1 = new Sub1();
		Sub1 sub_1 = new Sub1();
		System.out.println("In Sub1 class");
		sub1.add();

		SuperClass.multiply();
		System.out.println(sub1.callPrivateVariable());
	}

}
