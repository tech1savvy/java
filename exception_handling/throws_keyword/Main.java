public class Main {
		// Method that throws ArithmeticException
		public static double divide(int dividend, int divisor) throws ArithmeticException{
				if (divisor == 0) {
						throw new ArithmeticException("division by zero");
				}
				return dividend / divisor;
		}

		public static void main(String[] args) {
				int dividend = 10;
				int divisor = 0; // Attempting to divide by zero
				try {
						double result = divide(dividend, divisor);
						System.out.println(result);
				} catch (ArithmeticException e) {
						System.err.println(e.getMessage()); // Exception from divide() handeled here
				}
		}
}
