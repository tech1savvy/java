import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("b-kon");
		list.add("c-kon");
		System.out.println(list);

		list.addFirst("z-kon");
		list.addLast("a-kon");
		System.out.println(list);

		list.add(3,"d-kon");
		System.out.println(list);
	}
}