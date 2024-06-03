import java.util.*;

public class Main{
	public static void main(String[] args){
		// First-In First-Out
		Queue<String> queue = new LinkedList<>();

		queue.offer("a-kon");
		queue.offer("b-kon");
		queue.offer("c-kon");
		System.out.println(queue);

		System.out.println("peek(): "+queue.peek());
		System.out.println("after peek(): "+queue);

		System.out.println("poll: "+queue.poll());
		System.out.println("after poll(): "+queue);
	}
}