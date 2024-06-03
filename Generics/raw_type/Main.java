class A<T> { // generic class
}

public class Main {
	public static void main(String[] args) {

		A a1 = new A(); // raw type
		A<Integer> a2 = new A<Integer>(); // parametrized type

		// We can assign a parameterized type to a raw type
		a1 = a2;

		// when we assign a raw type to a parameterized type we get a warning
		a2 = b1;
	}
}