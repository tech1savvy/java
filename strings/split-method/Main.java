public class Main {

	public static void main(String[] args) {
		String ipAddress = "192.23.12.1";

		// Split the IP address string using the "." delimiter
		String[] parts = ipAddress.split("\\.");

		System.out.println("Numbers after splitting the IP address:");
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
