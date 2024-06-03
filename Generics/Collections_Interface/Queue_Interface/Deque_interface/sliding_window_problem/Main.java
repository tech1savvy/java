import java.util.*;

public class Main {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int key = 3;
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i: arr){
			deque.offerFirst(i);
			if(deque.size()==key){
				int result = 1;
				for(int j: deque){
					result+=j;
				}
				System.out.println(result);
				deque.pollLast();
			}
		}
	}
}