public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}

/*
LocalDateTime instances represent a date-time in the year-month-day-hour-minute-second-nanosecond format (yyyy-MM dd'T'HH:mm:ss.nnnnnnnnn), where the 'T' separates the date and time components.



You can create a LocalDateTime instance using static factory methods like LocalDateTime.now() (for the current date and time), LocalDateTime.of(year, month, day, hour, minute, second, nanoSecond), or LocalDateTime.parse(dateTimeString, formatted).
You can also create a LocalDateTime instance by combining a LocalDate and LocalTime using LocalDateTime.of(localDate, localTime).
LocalDateTime provides methods for retrieving individual components of the date-time, such as getYear(), getMonthValue(), getDayOfMonth(), getHour(), getMinute(), and getSecond().
You can perform date-time calculations like adding or subtracting days, months, years, hours, minutes, or seconds using methods like plusDays(), minusMonths(), withYear(), plusHours(), minusMinutes(), and withSecond().
LocalDateTime instances can be compared using relational operators like isBefore(), isAfter(), and equals().
*/