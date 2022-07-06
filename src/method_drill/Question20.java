package method_drill;

public class Question20 {
	static double getAverage(double array[]) {
		double sum = 0.0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		
		return sum/array.length;
	}
	
	public static void main(String[] args) {
		double score[] = {23.4,635.6,2341.3,5737.447,34672.84,262.27};
		System.out.println("平均点は"+getAverage(score)+"です");
	}
}
