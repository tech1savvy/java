public class Main {
	public static void main(String[] args) {
		int number = 123;
		int sum = 0;

		String str = ""+number;
		char[] digits = str.toCharArray();
		for(char i: digits){
			sum += Integer.parseInt(i+"");
		}
		System.out.println(sum);
	}
}