import java.time.*;

public class Main {
	public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,02,05); // output : nearest saturday 2024-02-10
        
        while(true){
            if(date.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println(date);
                break;
            }
            date = date.plusDays(1);
        }
	}
}