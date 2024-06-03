public class Main {
	public static void main(String[] args) {
		final int y;
		y = 12;
		y = 15; // can assign value to final only once
		final int x = 1;
		x--; // cannot change values
		System.out.println(x);


		int age; 		// age	-	 primitive 
		String firstName; 	// firstName	- reference 
		int[] marksArr; 	// marksArr	- reference 
		String[] cityNamesArr;	// cityNamesArr	- reference 

		/*
		In case of references, the cup  once assigned a reference cannot be assigned a new reference. However, the object which the reference points to (or refers to) can undergo changes by operations (method calls) on the object.
		*/
		final int[] marksArr1 = {20, 30, 40};
		final int[] marksArr2 = {10, 20, 30};
		marksArr1[0] = 70;	// this is a valid statement, 
			// since we are not changing the value in the cup  marksArr1

		// we are changing the value inside the object pointed by the cup marksArr1
		marksArr1 = marksArr2;	 // compiler will throw an error on this line
					// stating final variable marksArr1 cannot be reassigned
	}
}

/*
if an variable is both final and 
*/