import java.time.*;

public class DueDate{
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2024,05,10);
        int daysleft = 10;
        System.out.println("due date: "+date.plusDays(daysleft));
   }
}