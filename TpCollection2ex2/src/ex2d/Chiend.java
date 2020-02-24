package ex2d;

import java.util.*;

class Chiend implements Comparable {
	int nombre;
	int longueur;

	Chiend(int i, int j) {
		nombre = i;
		longueur = j;
	}

	public int compareTo(Object o) {
		if ((this.nombre) < (((Chiend) (o)).nombre))
			return -1;
		else if ((this.nombre) > (((Chiend) (o)).nombre))
			return 1;
		else
			return 0;
	}

	void imprimer() {
		System.out.println("Chien " + nombre);
	}

	public String toString() {
		return "Chien :" + nombre + ":" + longueur;
	}
}