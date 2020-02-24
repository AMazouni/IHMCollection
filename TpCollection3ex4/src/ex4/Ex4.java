package ex4;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex4 {
	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		test.add((int) 18);
		test.add(0.5);
		test.add("LST SIR");
		test.add(new Point(-1, 2));
		System.out.println("_______________for Loop________________________");
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i).getClass()+" "+test.get(i));
		}
		System.out.println("_______________forEach Loop________________________");
		test.forEach(e -> System.out.println(e.getClass()+" "+e));
		System.out.println("_______________Iterateur________________________");
		Iterator it= test.iterator();
		while(it.hasNext()) {
			Object element = it.next();
			System.out.println(element.getClass()+" "+element);
		}

	}
}
