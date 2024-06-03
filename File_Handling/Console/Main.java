import java.io.*;

public class Main {
	public static void main(String[] args) {
		String str; 
		char ch[];

		Console obj = System.console();

		System.out.print("enter usrname: ");
		str = obj.readLine();
		
		System.out.print("enter password: ");
		ch = obj.readPassword();
		String string = String.valueOf(ch);

		System.out.println("username = "+str);
		System.out.println("password = "+string);
	}
}