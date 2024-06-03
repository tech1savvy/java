class Animal {
	void eatSomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal {
	@Override // makes compulsory to override functions from superclass
	void eatsomthing() { // s is not capital, so its a different method
		System.out.println("eating foods");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal A = new Dog();
	A.eatSomething();

	}
}