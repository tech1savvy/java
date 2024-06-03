class InvalidAgeException extends Exception {
	InvalidAgeException(String str) {
		super(str);
	}
}

public class Main {
	public static void main(String[] args) {
	try{
		int age = 12;
		if(age < 18){
			throw new InvalidAgeException("not allowed to vote");
		} else{
			System.out.println("allowed to vote");
		}
	} catch(InvalidAgeException ex){
		System.out.println(ex);
	}
	}
}