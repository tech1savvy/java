import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		try{
			int num = Integer.parseInt(input);
		} catch(NumberFormatException err){
			System.out.println(err);
		} finally{
			scan.close();
		}
	}
}