

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		System.out.println("Liste vide : " + tm);
		tm.put(3, "R");
		tm.put(2, "Java");
		tm.put(1, "Python");
		System.out.println("Liste initiale des éléments: " + tm);
//Parcours de TreeMap dans n'importe quel ordre par for
		for (Map.Entry m : tm.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}
//Parcours d'un TreeMap par iterator
		System.out.println("Parcours de l'objet TreeMap par iterator: ");
		Set<Entry<Integer, String>> setHm = tm.entrySet();
		Iterator<Entry<Integer, String>> it = setHm.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("Valeur pour la clé 2 : " + tm.get(2));
		tm.putIfAbsent(4, "Scala");
		System.out.println("Après avoir appelé la méthode putIfAbsent(): ");
		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}