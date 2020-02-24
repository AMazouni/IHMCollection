package formes;



/**
 * @author ayoub
 *
 */
public class Cercle extends Forme {
	Point centre;
	Double rayon;
	
	public Cercle() {
		super();
	}

	public Cercle(Point centre, Double rayon) {
		super();
		this.centre = centre;
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [centre=" + centre + ", rayon=" + rayon + "]";
	}
	

}
