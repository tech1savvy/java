interface myInterface{
	void display();
}

class otherClass{
	public void display(){
			System.out.println("inside other class");
	}
}
public class Main {

	public static void main(String[] args) {
			// An anonymous class is very similar to a local class except that an anonymous class combines both the declaration and definition of the class into a single expression statement.

			myInterface A = new myInterface(){ // no name thus anonymous class
					int a=10; // automaticaly its

					public void display(){
							System.out.println("inside anonymous class 1: "+a);
					}

					class localClassInsideAnynomousClass{ // anonymous classes can have local classes

					}
			}; // end with semi-colon

			A.display();

			otherClass B = new otherClass(){
					public void display(){
							System.out.println("inside anonymous class 2");
					}
			};

			B.display();
	}
}

/*
An anonymous class can:
- have its own fields and but methods should be first declared in parent class or implemented interface, then only we can access then outside the anynomous class with the reference variable of its parent class and implemented interface.
- access members of its enclosing class
- have static fields provided they are also marked as final
- have local classes

An anonymous class cannot:
- be reused. In general, anonymous classes are not intended for reuse. They are typically used for one specific purpose and are not designed to be reused in multiple places within the codebase.
- access non-final local variables that are declared in its enclosing block
- have static methods or interfaces
*/