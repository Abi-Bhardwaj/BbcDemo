package corejava;

public class Sub3 extends SuperClass implements Specialization {

	Sub3() {
		//Sub3 sub3 = new Sub3();
		//Sub2 s2 = new Sub2();
	}

	public static void main(String[] args) {
		Sub3 sub3 = new Sub3();
		Sub3 sub_3 = new Sub3();
		System.out.println("In Sub3 class");
		sub3.add();
		sub3.Specialization();

	}

	@Override
	public void Specialization() {
		System.out.println("Specialization in Engineering");

	}

}
