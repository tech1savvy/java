import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2000,01,01);
		System.out.println("year: "+date.getYear());
		System.out.println("mongth: "+date.getMonth());
		System.out.println("month value: "+date.getMonthValue());
		System.out.println("day value: "+date.getDayOfMonth());

		LocalDate now = LocalDate.now();
		System.out.println("isBefore: "+date.isBefore(now));
		System.out.println("isAfter: "+date.isAfter(now));
		System.out.println("equals: "+date.equals(now));

		LocalDate modifiedDate = LocalDate.of(date.getYear(),date.getMonthValue(),date.getDayOfMonth());
		modifiedDate.plusDays(1);
		modifiedDate.plusMonths(2);
		modifiedDate.minusMonths(1);
		modifiedDate = modifiedDate.withYear(2001);
		System.out.println(modifiedDate);

		Scanner scan = new Scanner(System.in);
		System.out.print("enter dd-MM-yyyy: ");
		String input = scan.nextLine();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate inputDate = LocalDate.parse(input, format);
		System.out.println(inputDate.getDayOfWeek());
	}
}