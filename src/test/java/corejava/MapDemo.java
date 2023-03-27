package corejava;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.WebElement;

public class MapDemo {

	public static void main(String args[]) {
		MapDemo md = new MapDemo();

		HashedMap<Integer, String> hm = new HashedMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "bye");
		hm.put(42, "Morning");
		hm.put(5, "Evening");

		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));

		Set sm = hm.entrySet();
		Iterator it = sm.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
