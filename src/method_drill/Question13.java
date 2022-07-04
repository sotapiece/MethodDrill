package method_drill;

public class Question13 {
	static String getRandomMessage(String name) {
		int n = (int)(3*Math.random());
		String[] s = {"こんばんは","こんにちは","おはよう"};
		return s[n]+name+"さん";
	}
	
	public static void main(String[] args) {
		System.out.println(getRandomMessage("壮太"));
	}
}
