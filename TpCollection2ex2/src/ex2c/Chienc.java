package ex2c;

public class Chienc implements Comparable {
	int nombre;

	Chienc(int i) {
		nombre = i;
	}

	void imprimer() {
		System.out.println("Chienc " + nombre);
	}

    public String toString() {
		return "Chienc :" + nombre;
	}

	public int compareTo(Object o) {
		if ((this.nombre) < (((Chienc) (o)).nombre))
			return -1;
		else if ((this.nombre) > (((Chienc) (o)).nombre))
			return 1;
		else
			return 0;
	}
}