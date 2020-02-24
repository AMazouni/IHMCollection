package projetTest;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		Map<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(1, "Python");
		lhm.put(2, "Java");
		lhm.put(3, "R");
		lhm.put(4, "Scala");

		lhm.put(5, "Ruby");
		System.out.println("Parcours de l'objet LinkedHashMap par iterator: ");
		Set<Entry<Integer, String>> setLhm = lhm.entrySet();
		Iterator<Entry<Integer, String>> it2 = setLhm.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> e = it2.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		// Fetching key
		System.out.println("Keys: " + lhm.keySet());
		// Fetching value
		System.out.println("Values: " + lhm.values());
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + lhm.entrySet());
		System.out.println("Before invoking remove() method: " + lhm);
		lhm.remove(5);
		System.out.println("After invoking remove() method: " + lhm);
	}
}
