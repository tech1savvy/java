public class Main {
		private int n;
		Main(int n){
				this.n = n;
		}
		class innerClass{ // non-static nested classes are called as innner classes
				// innerClass has access to all the private memebers of its outer class
				// since it is also a memober of the outer class
				innerClass(){
						System.out.println("inside innerClass constructor, n: "+n);
				}
		}
		public static void main(String[] args) {
				Main A = new Main(1);
				// innerClass  B = new innerClass();
				// A.innerClass  B = new innerClass();
				// A.innerClass  B = new A.innerClass();
		/*
		error: 'new' non-static variable this cannot be referenced from a static context
		error: package A does not exist
		*/

				innerClass B = A.new innerClass();
				// A is the instance for which we need to create the non-static nested class object
				// since it is not static, it needs an instance reference

				Other.other();
		}
}

class Other{
		public static void other(){
				// inner class outside their outer class can be accessed using reference to its outer class
				Main B = new Main(0);
				System.out.println("inner class inside other class:");
				Main.innerClass C = B.new innerClass();
		}
}