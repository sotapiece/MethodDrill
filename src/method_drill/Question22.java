package method_drill;

public class Question22 {
	static double getDistanceFromOrigin(Point p) {
		return Math.sqrt(p.x*p.x+p.y*p.y);
		 
	}

	public static void main(String[] args) {
		Point p1 = new Point(2.3,4.6);
		Point p2 = new Point(0.0,0.0);
		System.out.println(getDistanceFromOrigin(p1));
		System.out.println(Question23.getDistanceBetweenTwoPoints(p1,p2));
	}
}

	

