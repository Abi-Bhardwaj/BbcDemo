package corejava;

import java.util.ArrayList;

import org.apache.bcel.generic.AALOAD;

public class ArrayListDemo {

	public static void main(String args[]) {
		
		//Arraylist ,LinkedList, Vector can accept duplicate values.
		//Arrays are of fix size, Arratlist can grow dynamically.
		//you can access and insert any value in any index
		ArrayList<String> a = new ArrayList<String>();
		a.add("Test");
		a.add("Test");	//Duplicate values can ne added
		a.add("Engineer");
		System.out.println(a);
		
		a.add(1, "Automation");
		System.out.println(a);
		
		a.remove(2);
		System.out.println(a);
		
		System.out.println(a.get(0));
		
		System.out.println(a.contains("Test"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		
	}
	
}
