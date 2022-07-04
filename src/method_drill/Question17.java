package method_drill;

public class Question17 {
	static boolean isSameAbsoluteValue(int i, int j) {
		return Math.abs(i) == Math.abs(j);
	}
	
	public static void main(String[] args) {
		System.out.println(isSameAbsoluteValue(8,6));
	}
}
