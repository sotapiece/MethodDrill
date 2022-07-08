package method_drill;

public class Question30 {
	static boolean isSameAge(Person person) {
		int myAge = 23;
		return person.getAge() == myAge;
	}
	
	public static void main(String[] args) {
		Person ps = new Person("壮太",23);
		System.out.println(isSameAge(ps));
	}
}
