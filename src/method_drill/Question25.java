package method_drill;

public class Question25 {
	static void printMessage(Person person) {
		System.out.println("こんにちは"+Person.getName()+"さん");
	}
	
	public static void main(String[] args) {
		Person p = new Person("壮太",25);
		printMessage(p);
	}
}
