import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		double num1 = 1.00;
		double num2 = 1.0103;
		System.out.printf("%.2f\n", num1); // 1.00
		System.out.printf("%05.2f\n", num1); // 5 digits including '.',decimal point

		/*
		if 1.00
			print 1
		if 1.0103
			print 1.01
		*/

		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println(df.format(num1));
		System.out.println(df.format(num2));
	}
}