package method_drill;
class Point {
	 double x;
	 double y;
	 
	 Point(double x, double y) {
		 this.x = x;
		 this.y = y;
	 }
}


public class Question24 {
	static Point getBarycenter(Point[] points) {
		double sumx = 0.0;
		double sumy = 0.0;
		for(int i = 0; i<points.length; i++) {
			sumx += points[i].x;
			sumy += points[i].y;
		}
		
		double px = sumx/points.length;
s		double py = sumy/points.length;
		
		Point pp = new Point(px,py);
		return pp;
	}
	
	public static void main(String[] args) {
		Point[] ps = new Point[5];
		ps[0] = new Point(4.4,6.4);
		ps[1] = new Point(6.4,7.7);
		ps[2] = new Point(3.7,9.2);
		ps[3] = new Point(7.5,1.9);
		ps[4] = new Point(5.4,2.0);
		
		System.out.println(getBarycenter(ps));
	}
}
