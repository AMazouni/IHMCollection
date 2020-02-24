package testCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	
	public static void afficher (Collection<String> collection) {
		collection.forEach(e -> System.out.print(e+" | "));
		
	}
	public static void main(String[] args) {
// création d'une collection de String
		Collection<String> collection = new ArrayList<String>();
		Collection<String> collectionB = new ArrayList<String>();
// ajout d'éléments à cette collection
		collection.add("un");
		collection.add("deux");
		collection.add("trois");
		collectionB.addAll(collection);
		collectionB.remove("trois");
// test d'appartenance de "deux"
		boolean b1 = collection.contains("deux");
		System.out.println("collection.contains(\"DEUX\") ="+b1); // affiche true
// test d'appartenance de "DEUX"
		boolean b2 = collection.contains("DEUX");
		System.out.println("collection.contains(\"DEUX\") =" +b2); // affiche false
//Test  si collection contient tout les elements de collectionB
		boolean b3 = collection.containsAll(collectionB);
//Test  si collectionB contient tout les elements de collection		
		boolean b4 = collectionB.containsAll(collection);
		System.out.println("collection.containsAll(collectionB)= "+b3+" | collectionB.containsAll(collection)="+b4); //True False
		System.out.println("parcourir les éléments de la collection avec un itérateur :");
// parcourir les éléments de la collection avec un itérateur
		Iterator<String> it = collection.iterator();
		while (it.hasNext()) {
			String element = it.next(); // retourne un objet de type String
			System.out.println(element);
			}
		collection.add("quatre");
		collection.add("cinq");
		
//la taille de la collection collection
		System.out.println("collection A size :"+collection.size());
		System.out.println("collection B size :"+collectionB.size());
		
		collection.retainAll(collectionB);
// parcourir les éléments de la collection avec un for each
		System.out.println("afficher collection : ");
		for (String element : collection) {
			System.out.println(element);
		}
//conversion d'une collection en tableau
		String[] tab = collection.toArray(new String[] {});
// affichage du contenu du tableau
		System.out.println("afficher le tableau tab : ");
		for (String element : tab) {
			System.out.println(element);
		}
//la taille du tableau tab
		System.out.println("taille de la table"+tab.length);
		
		System.out.println("afficher collectionB (method afficher() ) : ");
		afficher(collectionB);
		}
}