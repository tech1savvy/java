import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class Main {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2024, 1, 1);
		LocalDate endDate = LocalDate.of(2025, 12, 31);

		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		long weeksBetween = ChronoUnit.WEEKS.between(startDate, endDate);
		long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);
		long yearsBetween = ChronoUnit.YEARS.between(startDate, endDate);

		System.out.println("time between in years: "+yearsBetween);
		System.out.println("time between in months: "+monthsBetween);
		System.out.println("time between in weeks: "+weeksBetween);
		System.out.println("time between in days:"+daysBetween);

		// -------
		Period peroid = Period.between(startDate, endDate);

		System.out.println("only years between: "+peroid.getYears());
		System.out.println("only months between: "+peroid.getMonths());
		System.out.println("only days between: "+peroid.getDays());
	}
}
