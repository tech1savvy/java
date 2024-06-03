import java.time.LocalDate;
import java.time.DayOfWeek;

public class Main {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2024,3,1);
		LocalDate end = LocalDate.of(2024,3,31);

		int sundays = 0;
        while(start.isBefore(end) || start.equals(end)){
            if(start.getDayOfWeek() == DayOfWeek.SUNDAY){
                sundays++;
            }
            start = start.plusDays(1);
        }

		System.out.println(sundays); // 5
	}
}