import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("/path");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        byte[] b = str.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("writing into file, successful");
    }
}
