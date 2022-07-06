package method_drill;

public class Question24 {
	static Point getBarycenter(Point[] points) {
		double sumx = 0.0;
		double sumy = 0.0;
		for(int i = 0; i<points.length; i++) {
			sumx += points[i].x;
			sumy += points[i].y;
		}
		
		double px = sumx/points.length;
		double py = sumy/points.length;
		
		Point pp = new Point(px,py);
		return pp;
	}
	
	public static void main(String[] args) {
		Point[] ps = new Point[5];
		ps[0] = new Point(4.0,6.0);
		ps[1] = new Point(6.0,7.0);
		ps[2] = new Point(3.0,9.0);
		ps[3] = new Point(7.0,1.0);
		ps[4] = new Point(5.0,2.0);
		
		System.out.println("("+getBarycenter(ps).x+","+getBarycenter(ps).y+")");
	}
}
