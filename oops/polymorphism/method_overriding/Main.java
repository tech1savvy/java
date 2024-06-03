class A {	
	public int aValue = 2;
	public int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 3;
	public int getBValue() {
		return bValue;
	}
	public int getAValue() {  // this method overrides the implementation in class A
		return 2 * aValue; // returning  double of value stored in aValue
	}
}


public class Main {
	public static void main(String[] args) {
		// Then the below will print 4 and not 2:
		B b = new B();
		System.out.println(b.getAValue());
	}
}