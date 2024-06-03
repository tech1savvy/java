import java.util.ArrayList;
import java.util.Collection;
// growable array :: ArrayList

public class Main {
	public static void main(String[] args) {
		// ArrayList has 3 constructors
		ArrayList<String> emptyList = new ArrayList<String>();
		System.out.println(emptyList.size());

		Collection<String> collection = new ArrayList<>();
		collection.add("Apple");
		collection.add("Banana");
		collection.add("Orange");
		ArrayList<String> collectionList = new ArrayList<String>(collection);
		System.out.println(collectionList.size());

		ArrayList<Integer> initialCapacityList = new ArrayList<Integer>(6);
		System.out.println(initialCapacityList.size());

		/*
		 * When this array is filled with elements to its capacity, in order to
		 * accommodate new elements, ArrayList silently replaces the filled array with a
		 * new array of bigger capacity. It also restores all the existing elements in
		 * the old array into this new array before performing the add operation with
		 * the new element. So, it is better to provide initial capacity
		 * to avoid re-allocation.
		 */
	}
}