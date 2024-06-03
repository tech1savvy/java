import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BetweenDates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, format);

        System.out.println(date.format(format));
    }
}