import java.util.*;

public class Main {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.offer("1-head");
		deque.offer("2-middle");
		deque.offer("3-tail");

		deque.offerFirst("4-head");
		deque.offerLast("5-tail");
		System.out.println(deque);

		System.out.println("peekFirst(): "+deque.peekFirst());
		System.out.println("peekLast(): "+deque.peekLast());

		System.out.println("pollFirst(): "+deque.pollFirst());
		System.out.println("pollLast(): "+deque.pollLast());
	}
}