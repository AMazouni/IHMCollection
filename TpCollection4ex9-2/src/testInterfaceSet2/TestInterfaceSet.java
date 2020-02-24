package testInterfaceSet2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestInterfaceSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
// ajout d'élément
		System.out.println("J'ajoute un : " + set.add("un"));
		System.out.println("J'ajoute deux : " + set.add("deux"));
		System.out.println("J'ajoute trois : " + set.add("trois"));
		System.out.println("J'ajoute quatre : " + set.add("quatre"));
// ajout d'un doublon : échec
		System.out.println("J'ajoute encore un : " + set.add("un"));
// affichage de la taille du set
		System.out.println("Taille du set : " + set.size());
// création d'un Iterator sur cet ensemble
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		System.out.println("----------------------------------");
// création de HashSet à partir d'une autre collection
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("Java");
		liste.add("Python");

		liste.add("R");
		HashSet<String> st = new HashSet<String>(liste);
		st.add("Scala");
		Iterator<String> i = st.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// Convesion de hs en un Array
		Object[] objArray = st.toArray();
		System.out.println("Affichage des éléments du tableau crée à partir de st :");
		for ( Object o : objArray) {
			System.out.println(o);
		}
	}
}