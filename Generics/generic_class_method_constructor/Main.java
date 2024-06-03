class A<T> { // generic class
	// T is called type parameter
	// it's scope is entire class
	public T get(T value) {
		return value;
	}
}

class B { // non-generic class
	public <E> B(E e){ // generic constructor
		System.out.println("inside B constructor, e = " + e );
	}

	public <T> T get(T value) { // generic method
		return value;
	}
}

public class Main {
	public static void main(String[] args) {
		// A b1 = new A(); // Object is passed as type argument by defualt
		A<Integer> a2 = new A<Integer>(); // here, Integer is the type argument
		A<Double> a3 = new A<Double>();

		System.out.println(a2.get(1));
		System.out.println(a3.get(1.0));

		B b1 = new B("hello");

		System.out.println(b1.get(1));
		System.out.println(b1.get(1.0));
	}
}