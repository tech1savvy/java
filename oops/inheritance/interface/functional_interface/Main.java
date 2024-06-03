// an interface that has only single abstract method
	// can have multiple defualt and static methods
// main purpose of functional interfaces is to support lambda expressions and enable functional programming in Java
// functional interfaces can also be implemented using method references


@FunctionalInterface
	// @FunctionalInterface : not mandatory, recommended, this annotation serves as a compiler check to ensure that the interface has only one abstract method
	interface Operation{
		int perform(int a, int b);
	}
public class Main {
	public static void main(String[] args) {
		// simple lambda expression
		Runnable runnable = () -> System.out.println("Hello, Lambda!");
		runnable.run();

		Operation add = (int a,int b) -> {return a + b;};
		Operation sub = (a,b) -> a-b;

	int result1 = add.perform(1,2);
	int result2 = sub.perform(1,2);

	System.out.println(result1);
	System.out.println(result2);

	}
}

/*
- Built-in Functional Interfaces: 
	available in java.util.function package
	- Predicate, Consumer, Function, Supplier, and others. 
	// used for working with streams, collections, and event handling.
*/