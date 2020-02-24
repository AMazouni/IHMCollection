package treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	System.out.println("Question 1 \n\n");
	Set<String> tree = new TreeSet();
	tree.add("Ahmed");
	tree.add("Omar	");
	tree.add("Mohamed");
	tree.add("Lina");
	tree.add("Zakaria");
	tree.add("Hiba");
	Iterator<String> it = tree.iterator();
	while(it.hasNext())
	System.out.println(it.next());
	System.out.println("\n\n Question 2 \n\n");
	 // Créer l'ensemble trié (SortedSet)
	SortedSet set = new TreeSet();
	// Ajouter des éléments à l'ensemble
	set.add("Python"); set.add("Scala"); set.add("Qt"); set.add("R"); set.add("Java");
	// Itérer sur les éléments de l'ensemble
	Iterator itt = set.iterator();
	while (itt.hasNext()) {
	// Obtenir l'élément
	Object element = itt.next();
	System.out.println(element.toString());
	}
	}
}

