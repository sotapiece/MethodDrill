package method_drill;

public class Question06 {
	static void printRandomMessage(String name) {
		int n = (int)(3*Math.random());
		if(n == 0) {
			System.out.println("こんばんは"+name+"さん");
		}else if(n == 1) {
			System.out.println("こんにちは"+name+"さん");
		}else if(n == 2) {
			System.out.println("おはよう"+name+"さん");
		}
	}
	
	public static void main(String[] args) {
		printRandomMessage("こころe");
	}
}