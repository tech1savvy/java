import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(1);

		System.out.println("unsorted: "+list);

		Collections.sort(list);
		System.out.println("sorted: "+list);

		Collections.reverse(list);
		System.out.println("reversed: "+list);
	}
}