import java.util.Stack;

public class Main {
		public static void main(String[] args) {
				Stack<Integer> stack = new Stack<>();

				stack.push(1);
				stack.push(2);
				stack.push(3);

				System.out.println("Stack: " + stack);

				int poppedElement = stack.pop();
				System.out.println("Popped element: " + poppedElement);

				System.out.println("Peek: " + stack.peek());
				System.out.println("Is stack empty? " + stack.isEmpty());
		}
}