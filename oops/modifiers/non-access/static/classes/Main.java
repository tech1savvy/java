public class Main {
		int a;
		static class nestedClass{
				// static classes can only be declared inside another class, hence known as nested classes
				int b;
				nestedClass(int b){
						this.b = b;
				}
				public int getValue(){
						return b;
				}
		}
		public static void main(String[] args) {
				System.out.println("inside outer class");
				// nested class can be accessed directly inside its outer class
				nestedClass A = new nestedClass(1);
				System.out.println("nested class field inside outer class:"+A.getValue());

				Other.other();
		}
}

class Other{
		public static void other(){
				// nested class outside their outer class can be accessed using reference to its outer class
				Main.nestedClass B = new Main.nestedClass(0);
				System.out.println("nested class field inside other class:"+B.getValue());
		}
}