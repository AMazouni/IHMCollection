package lstPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LstPoint {
	static List<Point> lstPoint = new ArrayList<Point>();

	public static void ajouteUnPoint(Point point) {
      lstPoint.add(point);
	}

	public static void afficheLesPoints() {
      lstPoint.forEach(c -> System.out.println(lstPoint.indexOf(c)+ " : "+c));
	}

	public static void main(String[] args) {
     
		Point a = new Point(5,10);
		Point b = new Point(8,9);
		Point c = new Point(11,7);
		
		ajouteUnPoint(a);
		ajouteUnPoint(b);
		ajouteUnPoint(c);
		
		afficheLesPoints();
		
		System.out.println("_______________for Loop________________________");
		for (int i = 0; i < lstPoint.size(); i++) {
			System.out.println(i+" : "+lstPoint.get(i));
		}
		System.out.println("_______________forEach Loop________________________");
		for( Point x : lstPoint) {
			System.out.println(lstPoint.indexOf(x)+" : "+x);
		}
		System.out.println("_______________Iterator________________________");
		ListIterator<Point> it = lstPoint.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
