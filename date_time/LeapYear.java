import java.time.*;

public class LeapYear{
    public static void main(String[] args){
        int startYear = 2000;
        int endYear = 2024;

        for(int i=startYear; i<=endYear; i++){
            Year year = Year.of(i);
            if(year.isLeap()){
                System.out.println(year);
            }
        }
    }
}