class A {
}

class B<T> {
}

class C<T> {
	// this T is different from class B's T
}


public class Main {
	public static void main(String[] args) {
		// B<A> b1 = new B<A>(); // statement 4

		// type argument can be a nested type argument like B<Integer<String>>
			// for structures like Map
		C<B<A>> c1 = new C<B<A>>();

		// type argument will be defaulted to Object class.
		C c2 = new C();

		// primitive type cannot be passed as a type argument.
			// it should be a wrapper class like Integer, Double, etc.
		C<int> c4 = new C<int>();

		// array can be passed as a type argument.
		C<int[]> c3 = new C<int[]>();
	}
}