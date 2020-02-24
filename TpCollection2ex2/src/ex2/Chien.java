package ex2;

import java.util.*;

public class Chien {
	int nombre;

	Chien(int i) {
		nombre = i;
	}

	void imprimer() {
		System.out.println("Chien " + nombre);
	}

	public String toString() {
		return "Chien :" + nombre;
	}
}