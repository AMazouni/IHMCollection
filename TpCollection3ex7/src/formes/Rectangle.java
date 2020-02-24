package formes;



public class Rectangle extends Forme {

	Point a;
	Point b;
	Point c;
	Point d;
	Double longueur;
	Double largeur;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(Point a, Point c) {
		super();
		this.a = a;
		this.c = c;
		this.b = new Point(a.x,c.y);
		this.d = new Point(c.x,a.y);
		this.largeur= Math.abs(a.x-c.x);
		this.longueur=Math.abs(a.y-c.y);
	}
	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", c=" + c + ", longueur=" + longueur + ", largeur=" + largeur + "]";
	}
	
	
}
