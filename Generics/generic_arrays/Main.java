class A<T extends Number>{
	T[] numbers;
	A(T[] numbers){
		this.numbers = numbers;
	}
	void display(){
		for(T t: numbers){
			System.out.println(t.intValue());	
		}
	}
}

public class Main {
	public static void main(String[] args) {
		A<Integer> a = new A<Integer>(new Integer[]{1,2,3});
		a.display();

	}
}