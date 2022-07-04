package method_drill;

public class Question18 {
	static String getMessage(String name, boolean isKid) {
		if(isKid) {
			return "こんにちは"+name+"さん";
		}else {
			return "こんにちは"+name+"ちゃん";
		}
	}
	public static void main(String[] args) {
		System.out.println(getMessage("壮太", true));
	}
}
