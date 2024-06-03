public class Main {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println("Is character a letter? " + Character.isLetter(ch));
		System.out.println("Is character uppercase? " + Character.isUpperCase(ch));
		System.out.println("Is character lowercase? " + Character.isLowerCase(ch));
		System.out.println("Uppercase character: " + Character.toUpperCase(ch));
		System.out.println("Lowercase character: " + Character.toLowerCase(ch));
		System.out.println("Is character a digit? " + Character.isDigit(ch));
		System.out.println("Is character whitespace? " + Character.isWhitespace(' '));
		System.out.println("Is character a punctuation mark? " + Character.isWhitespace('.'));
	}
}

