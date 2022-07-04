package method_drill;

public class Question07 {
	static void printMessage(String message, int count) {
		for(int i = 0; i<count; i++) {
			System.out.println(message);
		}
	}
	
	public static void main(String[] args) {
		printMessage("ピカチュウ",25);
	}
}
