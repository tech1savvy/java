// bounded types :: types are restricted to some wrapper classes

class SingleBoundType<T extends Number> {
	public SingleBoundType(T t) {
		System.out.println(t);
	}
}

interface Interface {
}

class MultipleBoundType<T extends SingleBoundType & Interface> {
	// in this case, extend can be used for both classes and interfaces
	// classes should come first in order before interfaces
}

public class Main {
	public static void main(String[] args) {

		SingleBoundType<Integer> s1 = new SingleBoundType<Integer>(1);
		// SingleBoundType<String> s2 = new SingleBoundType<>("hello"); // error

	}
}