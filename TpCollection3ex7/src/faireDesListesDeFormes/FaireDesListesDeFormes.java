package faireDesListesDeFormes;



import java.util.Scanner;

import listeDeFormes.ListeDeFormes;

public class FaireDesListesDeFormes {
	public static void main(String[] args) {
    ListeDeFormes liste = new ListeDeFormes();
    System.out.println("Debut du programme");
    Scanner input = new Scanner(System.in);
    char choice = 'M';
    while(choice != 'X') {
    	System.out.println("\nChoisir l'opération à effectuer:\nC = ajouter un cercle\nT = Ajouter un triangle\nR= ajouter un rectangle\nA = Afficher \n X = Quitter");
    	choice= input.next().charAt(0);
    	if (choice == 'A') liste.afficherLesFormes();
    	else if ( choice != 'X') liste.ajouteUneForme(choice);
    }
    input.close();
    System.out.println("Fin du programme");
    
	}
   
}
