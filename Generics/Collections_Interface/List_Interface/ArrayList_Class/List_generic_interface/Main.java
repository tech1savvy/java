import java.util.*;

public class Main {
	public static void main(String[] args) {
		// list is a generic interface

		List aList = new ArrayList(); // raw type

		List<String> bList = new ArrayList<String>();
		List<String> cList = new ArrayList<>();
		// above statements are equivalent

		// Even if List and ArrayList are E type , i.e. need Element Type E , 
			// we can assign Array to them too or any other type paramenter like nested-type also
		List<String[]> dList = new ArrayList<String[]>();

		// error assigining raw type to parameterized type
		List<String> eList = new ArrayList();

		// no error, we can assign ray type to parameterized type
		List fList = new ArrayList<String>();

	}
}