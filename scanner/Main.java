import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine(); //  to catch the nextline char released by above
		String str = scanner.nextLine();

		System.out.println(n);
		System.out.println(str);
	}
}