import java.util.*;

public class Main {
	public static void main(String[] args) {
		// Natural Ordering (ascending)
		System.out.println("Natural Ordering (ascending):");
		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(5);
		tree.add(2);
		tree.add(8);

		for (int number : tree) {
			System.out.println(number);
		}

		// customTree Comparator
		Comparator <Integer> comparator = (a, b) -> {
			if(a<b) return 1;
			else return -1;
		};
		System.out.println("Custom order (descending)");
		Set<Integer> customTree = new TreeSet<>(comparator);
		// Set<Integer> customTree = new TreeSet<>((a,b) -> b-a);
		customTree.addAll(tree);

		for (int number : customTree) {
			System.out.println(number);
		}
	}
}
