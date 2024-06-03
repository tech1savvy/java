public class Main {
	public static void main(String[] args) {
	}
}

/*
It represents a time in the hour-minute-second-nanosecond format (HH:mm:ss.nnnnnnnnn).
It provides methods for retrieving individual components of the time, such as getHour(), getMinute(), and getSecond().
You can create a LocalTime instance using static factory methods like LocalTime.now() (for the current time), LocalTime.of(hour, minute, second, nanosecond), or LocalTime.parse(timeString, formatter).
LocalTime instances can be compared using relational operators like isBefore(), isAfter(), and equals().
You can perform time calculations like adding or subtracting hours, minutes, seconds, or nanoseconds using methods like plusHours(), minusMinutes(), and withSecond().
LocalTime instances do not store time zone information and represent a time in the context of a 24-hour clock.
*/