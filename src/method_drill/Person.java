package method_drill;

class Person {
	 private static String name;
	 private static int age;
	 
	 Person(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 public static String getName() {
		return name;
	 }
	 
	 public static int getAge() {
		 return age;
	 }
}
