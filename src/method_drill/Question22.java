package method_drill;

class Point {
	 double x;
	 double y;
	 
	 Point(double x, double y) {
		 this.x = x;
		 this.y = y;
	 }
}

public class Question22 {
	static double getDistanceFromOrigin(Point p) {
		return Math.sqrt(p.x*p.x+p.y*p.y);
		 
	}

	public static void main(String[] args) {
		Point p1 = new Point(2.3,4.6);
		System.out.println(getDistanceFromOrigin(p1));
	}
}

	

