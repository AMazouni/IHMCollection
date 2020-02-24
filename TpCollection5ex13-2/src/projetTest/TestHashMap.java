package projetTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Liste vide : " + hm);
		hm.put(3, "R");
		hm.put(2, "Java");
		hm.put(1, "Python");
		System.out.println("Liste initiale des éléments: " + hm);
//Parcours de HashMap dans n'importe quel ordre par for
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
//Parcours d'un HashMap par iterator
		System.out.println("Parcours de l'objet HashMap par iterator: ");
		Set<Entry<Integer, String>> setHm = hm.entrySet();
		Iterator<Entry<Integer, String>> it = setHm.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("Valeur pour la clé 2 : " + hm.get(2));
		hm.putIfAbsent(4, "Scala");
		System.out.println("Après avoir appelé la méthode putIfAbsent(): ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Ruby");
		map.putAll(hm);
		System.out.println("Après avoir invoqué la méthode putAll() ");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
//suppression par clé
		map.remove(5);
		System.out.println("Liste des éléments mise à jour: " + map);
		System.out.println("Liste des éléments mise à jour: " + map);
//suppression par clé-valeur
		map.remove(3, "R");

		System.out.println("Liste des éléments mise à jour: " + map);
	}
}