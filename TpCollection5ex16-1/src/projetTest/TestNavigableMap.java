package projetTest;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TestNavigableMap {
	public static void main(String[] args) {
		NavigableMap<Integer, String> tm = new TreeMap<Integer, String>();

		System.out.println("Liste vide : " + tm);
		tm.put(3, "R");
		tm.put(4, "Scala");
		tm.put(2, "Java");
		tm.put(1, "Python");
		System.out.println("Liste initiale des éléments: " + tm);
//Parcours d'un HashMap par iterator
		System.out.println("Parcours de l'objet TreeMap par iterator: ");
		Set<Entry<Integer, String>> setHm = tm.entrySet();
		Iterator<Entry<Integer, String>> it = setHm.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
//Maintient l'ordre décroissant
		System.out.println("descendingMap: " + tm.descendingMap());
//Renvoie des paires clé-valeur dont les clés sont inférieures ou égales
// à la clé spécifiée.
		System.out.println("headMap: " + tm.headMap(3, true));
// Renvoie des paires clé-valeur dont les clés sont supérieures ou égales
// à la clé spécifiée.
		System.out.println("tailMap: " + tm.tailMap(3, true));
// Renvoie des paires clé-valeur entre la clé spécifiée.
		System.out.println("subMap: " + tm.subMap(1, false, 4, true));
	}
}