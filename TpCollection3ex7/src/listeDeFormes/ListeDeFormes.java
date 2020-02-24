package listeDeFormes;

import java.util.ArrayList;

import formes.*;

public class ListeDeFormes {
	ArrayList<Forme> listeFormes;

	public ListeDeFormes() {
		super();
		this.listeFormes = new ArrayList<Forme>();
	}

	public int ajouteUneForme(char F) {
		Forme forme;
		if (F == 'C') {
			forme = new Cercle();
		} else if (F == 'T') {
			forme = new Triangle();
		} else if (F == 'R') {
			forme = new Rectangle();
		} else {
			System.out.println("Erreur parametre " + F + " inconnu");
			return 0;
		}
		this.listeFormes.add(forme);
		return 1;
	}

	public void afficherLesFormes() {
		for (int i = 0; i < this.listeFormes.size(); i++) {
			System.out.print("\n Element " + i + " : " + this.listeFormes.get(i));
		}
	}
}
