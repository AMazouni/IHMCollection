package ex2c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainChienc {
	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			c.add(new Chienc(r.nextInt(100)));
		for (int i = 0; i < c.size(); i++)
			System.out.println(i + " " + c.get(i));
		System.out.println("max " + Collections.max(c));
		Collections.sort(c);
		for (int i = 0; i < c.size(); i++)
			System.out.println(i + " " + c.get(i));
	}
}