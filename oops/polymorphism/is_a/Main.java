// since Object class is the superclass (root class) of every class, instance of any class is also an instance of Object class
class Person {
}

public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		// In the above code, the instance referred by p IS-A Person. Since every class in Java, including Person is a subclass of Object, the statement p IS-A Object is also correct.
	}
}