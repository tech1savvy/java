class ParentClass{
	final ParentClass(){ // Constructors cannot be marked as final because they cannot be inherited or overridden.

	}
	final void display(){
		System.out.println("parent definition");
	}
}

public class Main extends ParentClass{
	public static void main(String[] args) {
		Main A = new Main();
		A.display();
	}
	void display(){ // error : cannot override final methods
		System.out.println("child definition");
	}
}

/*
There are two main use cases for declaring a method as final:

- Preventing Overriding: 
	When a method is marked as final, it is a clear indication that the method's implementation should not be changed or overridden in subclasses. This can be useful when you want to ensure that a particular behavior remains constant throughout the inheritance hierarchy.
- Performance Optimization: 
	The Java compiler can apply certain optimizations to final methods because it knows that the method cannot be overridden. This can lead to improved performance, especially for frequently called methods.
*/