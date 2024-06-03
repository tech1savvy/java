import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
		public static void main(String[] args) {
				LocalDateTime now = LocalDateTime.now();
				System.out.println("before formatting: "+now);

				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				String formattedNow = now.format(format);
				System.out.println("after formatting: "+formattedNow);
		}
}