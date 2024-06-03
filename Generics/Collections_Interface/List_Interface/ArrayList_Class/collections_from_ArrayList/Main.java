import java.util.Collections;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Akon");
		list.add("Bkon");
		list.add("Ckon");

		Collections.addAll(list, "Dkon", "Ekon");

		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);

		System.out.println("max: " + Collections.max(list));
		System.out.println("min: " + Collections.min(list));

		System.out.println("Before updating element at index 2: " + list.get(2));
		list.set(2, "?kon");
		System.out.println("After updating element at index 2: " + list.get(2));
	}
}
