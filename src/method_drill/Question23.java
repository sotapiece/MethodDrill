package method_drill;

public class Question23 {
	static double getDistanceBetweenTwoPoints(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x)+(p1.y - p2.y)*(p1.y - p2.y));
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(3.2,4.2);
		Point p2 = new Point(5.2,7.7);
		System.out.println("2点間の距離は"+getDistanceBetweenTwoPoints(p1,p2));
	}
}
