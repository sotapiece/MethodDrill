package method_drill;

public class Question26 {
	static boolean isAdult(Person person) {
		return Person.getAge() >= 20;
	}
	
	public static void main(String[] args) {
		Person p = new Person("壮太",23);
		System.out.println(isAdult(p));
	}
}
