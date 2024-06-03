import java.util.*;
// ? :: wildcard 
	// represents unkonwn type

public class Main {

	// any type is allowed
	static void unbound(List<?> list){
		System.out.println(list);
	}

	// type higher to Number is not allowed	
	static void upperbound(List<? extends Number> list){
		System.out.println(list);
	}

	// type lower to Number is not allowed
	static void lowerbound(List<? super Number> list){
		System.out.println(list);
	}

	public static void main(String[] args) {
		unbound(Arrays.asList('a','b','c'));
		upperbound(Arrays.asList(1,2,3));
		upperbound(Arrays.asList(1.0,2.0,3.0));
		lowerbound(Arrays.asList(new Object(), new Object(), new Object()));
	}
}