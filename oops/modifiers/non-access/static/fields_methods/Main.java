public class Main {
		public static int staticField = 0;
		int instanceField;

		Main(int x){
				this.instanceField = x;
		}

		public static void main(String[] args) {
				System.out.println("static field: "+Main.staticField); // can be accessed without object/instance
				Main A = new Main(3);
				System.out.println("instance field: "+getInstanceField(A));
		}

		public static int getInstanceField(Main obj){
				// System.out.println(this.instanceField); // error: non-static variable instanceField cannot be referenced from a static context
				return obj.instanceField;
		}
}