import java.util.*;

public class Main {
	@SuppressWarnings("unchecked") // remove warning message
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("akon");
		list.add("bkon");
		list.add("ckon");

		for(Object obj: list){
			System.out.println(obj);
		}
		}
}