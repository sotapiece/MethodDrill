package method_drill;

public class Question09 {
	static void printMaxValue(double a, double b, double c) {
		double[] n = {a,b,c}; 
		
		double max = 0;
		for(double m : n) {
			max =Math.max(max, m);
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		printMaxValue(2.5,3.6,4.5);
		
	}
}