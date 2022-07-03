package method_drill;

public class Question03 {
	static void printRandomMessage() {
		int n = (int)(3*Math.random());
		if(n == 0) {
			System.out.println("こんばんは");
		}else if(n == 1) {
			System.out.println("こんにちは");
		}else if(n == 2) {
			System.out.println("おはよう");
		}
	}
	
	public static void main(String[] args) {
		printRandomMessage();
	}
}
