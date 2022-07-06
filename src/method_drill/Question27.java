package method_drill;

public class Question27 {
	static Person getYoungestPerson(Person[] persons) {
		int age = persons[0].getAge();
		for (int i = 0; i < persons.length; i++) {
			if (age >= persons[i].getAge()) { 
				age = persons[i].getAge();
			}
		}	
		String name = "";
		for(int i = 0; i < persons.length; i++) {
			if(age == persons[i].getAge()) {
				name = persons[i].getName();
			}
		}
		
		Person pp = new Person(name,age);
		return pp;
	}
	
	public static void main(String[] args) {
		Person[] ps = new Person[3];
		ps[0] = new Person("壮太",23);
		ps[1] = new Person("こころ",19);
		ps[2] = new Person("しゅうと",22);
		
		
		System.out.println(getYoungestPerson(ps).getName());
		
	}
}
