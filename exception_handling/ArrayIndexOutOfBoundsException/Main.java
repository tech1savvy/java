public class Main {
	public static void main(String[] args) {
		int[] arr = {2,4,7,9};
		try{
			System.out.println(arr[4]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}