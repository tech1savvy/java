import java.time.*;

public class Main {
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("America/New_York");
		ZonedDateTime zoneTime = ZonedDateTime.now(zoneId);
		System.out.println(zoneTime);
	}
}