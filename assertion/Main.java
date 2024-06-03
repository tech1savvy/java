// run with '-ea' flag to enable assertions
// java -ea Main
public class Main {
	public static void main(String[] args) {
		try{
			int num1 = 1;
			int num2 = -1;
			assert(num1 > 0);
			System.out.println(num1);
			assert(num2 > 0);
			System.out.println(num2);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}