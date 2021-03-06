package projetTest;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {
	public static void main(String[] args) {

		SortedMap<Integer, String> tm = new TreeMap<Integer, String>();
		System.out.println("Liste vide : " + tm);
		tm.put(3, "R");
		tm.put(4, "Scala");
		tm.put(2, "Java");
		tm.put(1, "Python");
		System.out.println("Liste initiale des éléments: " + tm);
//Parcours d'un HashMap par iterator
		System.out.println("Parcours de l'objet SortedMap par iterator: ");
		Set<Entry<Integer, String>> setHm = tm.entrySet();
		Iterator<Entry<Integer, String>> it = setHm.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
//Renvoie des paires clé-valeur dont les clés sont inférieures à
// la clé spécifiée.
		System.out.println("headMap: " + tm.headMap(3));
// Renvoie des paires clé-valeur dont les clés sont supérieures ou égales
//à la clé spécifiée.
		System.out.println("tailMap: " + tm.tailMap(3));
// Renvoie des paires clé-valeur entre les clés spécifiées.
		System.out.println("subMap: " + tm.subMap(1, 4));
	}
}