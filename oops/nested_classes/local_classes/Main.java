public class Main {
		// a nested class which is declared inside a block (between opening and closing braces) is called a local class
		public void fun(){
				class localClass{
						// local classes can access the instance members of their enclosing class like non-static inner classes
						// local classes cannot have satic memerbs or intefaces
						// we can have static fileds only if they are marked final (called constants)

						final static int a = 1;
						int b;

						localClass(int b){
								this.b = b;
						}

						public void display(){
								System.out.println("static final field a: "+a);
								System.out.println("instance field b: "+b);
						}
				}
				localClass localObj = new localClass(0);
				localObj.display();
		}
		public static void main(String[] args) {
				Main A = new Main();
				// Main.localClass obj = A.new localClass(); // error
				// scope of local class : within the enclosing block or braces
				A.fun();
		}
}