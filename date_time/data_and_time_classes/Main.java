import java.time.*; // java.time package - replacemnt for Date, Calendar, and DateFormat, introduced in Java 8

public class Main {
	public static void main(String[] args) {
		// Instant - represent a moment in time-scale, in nanoseconds
			Instant now = Instant.now();
			System.out.println(now);
		// LocalDate - immutable
			LocalDate localDate = LocalDate.now();
			System.out.println(localDate);
			LocalDate javaBirthday = LocalDate.of(1995,Month.MAY,23);
			System.out.println(javaBirthday);
		// LocalTime - immutable
			LocalTime localTime = LocalTime.now();
			System.out.println(localTime);
		// LocalDateTime - immutable
			LocalDateTime localDateTime = LocalDateTime.now();
			System.out.println(localDateTime);
		// ZonedDateTime
			ZonedDateTime zonedDateTime = ZonedDateTime.now();
			System.out.println(zonedDateTime);
	}
}