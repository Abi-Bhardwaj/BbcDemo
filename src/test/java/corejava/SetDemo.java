package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	
	public static void main(String args[]) {
		
		//Hashset treeset, LnkedHashSet implements Set interface.
		//does not accept duplicate values
		//There is no guarentee of data saving in sequentially order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("US");
		hs.add("UK");
		hs.add("India");
		hs.add("India");	//Duplicate values are not added
		hs.add("he");
		
		System.out.println(hs);
		
		//System.out.println(hs.remove("UK"));
		
		System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
