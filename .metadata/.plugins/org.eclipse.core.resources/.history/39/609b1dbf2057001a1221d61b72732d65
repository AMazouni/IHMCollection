package projetTest;

import java.util.*;

public class TestVector {
	public static void main(String args[]) {
		/* Vector de capacity(size) initiale de 2 */
		Vector<String> vec = new Vector<String>(2);
		/* Ajout des elements au vector */
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		/* Affichage de size et capacity */
		System.out.println("La taille est: " + vec.size());

		System.out.println("la capacité par défaut est: " + vec.capacity());
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		/* Taille et capacityIncrement après les deux insertions */
		System.out.println("Taille après l'ajout: " + vec.size());
		System.out.println("Capacite après l'incrémentation est: " + vec.capacity());
		/* Affichage des éléments du Vector */
		Enumeration en = vec.elements();
		System.out.println("\n Les éléments sont:");
		while (en.hasMoreElements())

			System.out.print(en.nextElement() + " ");

	}
}
