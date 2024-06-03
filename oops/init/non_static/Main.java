public class Main {

		Main(){ // init blocks get added to the start of all the constructor
				// They appear in the order they are present inside the class
				System.out.println("inside constructor");
		}

		{
				System.out.println("non-static init 1");
		}

		{
				System.out.println("non-static init 2");
		}

		public static void main(String[] args) {
				System.out.println("inside main");
				Main A = new Main();
		}

		{
				System.out.println("non-static init 3");
		}
}