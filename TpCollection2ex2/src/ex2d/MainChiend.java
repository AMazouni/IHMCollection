package ex2d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class ChienComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if ((((Chiend) (o1)).longueur) < (((Chiend) (o2)).longueur))
			return -1;
		else if ((((Chiend) (o1)).longueur) > (((Chiend) (o2)).longueur))
			return 1;
		else
			return 0;
	}
}

public class MainChiend {
	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			c.add(new Chiend(r.nextInt(100), r.nextInt(10)));

		for (int i = 0; i < c.size(); i++)
			System.out.println(i + "->" + ((Chiend) c.get(i)).nombre + ":" + ((Chiend) c.get(i)).longueur);

		Comparator comp = new ChienComparator();
		System.out.println("max comparateur" + Collections.max(c, comp));
		Collections.sort(c, comp);
		for (int i = 0; i < c.size(); i++)
			System.out.println(i + "->" + ((Chiend) c.get(i)).nombre + ":" + ((Chiend) c.get(i)).longueur);
		System.out.println("max comparable" + Collections.max(c));
		Collections.sort(c);
		for (int i = 0; i < c.size(); i++)
			System.out.println(i + "->" + ((Chiend) c.get(i)).nombre + ":" + ((Chiend) c.get(i)).longueur);

	}
}