package testInterfaceSet;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollection {
	public static void main(String[] args) {
//Création de HashSet et ajout d'éléments
		HashSet<Object> hs = new HashSet<Object>();
		hs.add("Marrakech");
		hs.add(2020);
		hs.add('E');
		hs.add('C');
		System.out.println("Une première liste d'éléments: " + hs);
		System.out.println("Affichage par iterator: ");
		Iterator<Object> it = hs.iterator();
		while (it.hasNext())
			System.out.println(it.next());
// Suppression d'un élément spécifique de HashSet
		hs.remove('E');
		System.out.println("Après avoir appelé la méthode remove(object): " + hs);

		HashSet<Object> hs1 = new HashSet<Object>();
		hs1.add("Java");
		hs1.add("Python");
		hs.addAll(hs1);
		// Convesion de hs en un Array
		Object[] objArray = hs.toArray();
		System.out.println("Liste mise à jour: " + hs);
		System.out.println("Affichage des éléments du tableau :");
		for ( Object o : objArray) {
			System.out.println(o);
		}
//Suppression de tous les nouveaux éléments de HashSet
		hs.removeAll(hs1);
		System.out.println("Après avoir appelé la méthode removeAll(): " + hs);
// Suppression de tous les éléments disponibles dans l'ensemble
		hs.clear();
		System.out.println("Après avoir invoqué la méthode clear(): " + hs);
	}
}