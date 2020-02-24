package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class ChienComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if ((((Chien) (o1)).nombre) < (((Chien) (o2)).nombre)) {

			return -1;
		} else if ((((Chien) (o1)).nombre) > (((Chien) (o2)).nombre)) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class MainChien {
	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			c.add(new Chien(r.nextInt(100)));
		for (int i = 0; i < c.size(); i++)
			System.out.println(i + " " + c.get(i));
		Comparator comp = new ChienComparator();
		System.out.println("max " + Collections.max(c, comp));
		Collections.sort(c, comp);
		for (int i = 0; i < c.size(); i++)
			System.out.println(i + " " + c.get(i));

	}
}