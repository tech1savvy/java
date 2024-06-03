import java.util.Scanner;
// or import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// single char as input
		String str = scan.next();
		char ch = str.charAt(0);
		System.out.println(ch);
	}
}