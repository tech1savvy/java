import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(1);
		System.out.println(list);

		System.out.println("min: "+Collections.min(list));
		System.out.println("max: "+Collections.max(list));

		Collections.sort(list);
		System.out.println("second min: "+list.get(1));
		Collections.reverse(list);
		System.out.println("second max: "+list.get(1));
	}
}