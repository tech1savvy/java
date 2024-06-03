class P{
	public static void fun(){
		System.out.println(1);
	}
}

class C extends P{
	public static void fun(){
		System.out.println(2);
	}
}

public class Main {
	public static void main(String[] args) {
		P obj = new C();
		obj.fun();
	}
}