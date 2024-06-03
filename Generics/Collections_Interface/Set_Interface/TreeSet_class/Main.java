import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		System.out.println(treeSet);
		treeSet.add("A"); // TreeSet.add() accepts only unique values
		System.out.println(treeSet);

		// remove()
		// contains()
		// can use only for each loop
	}
}

// TreeSet implements NavigableSet
// NavigableSet extends SortedSet
// SortedSet extends Set