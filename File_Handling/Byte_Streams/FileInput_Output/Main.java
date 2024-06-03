import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// InputStream and OutputStream Abstract Classes
// are concretely implemented in 

// FileInputStream, FileOutputStream Classes, and
// - read, write byte by byte

// BufferedInputStream, BufferedOutputStream Classes
// - read, write in chunks of bytes
// - more efficent and faster

public class Main{
    public static void main(String[] args) {
        try {

            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");
         
            // Read bytes from input file and write them to output file
            int byteRead;
            while ((byteRead = fin.read()) != -1) {
                fout.write(byteRead);
            }
            
            fin.close();
            fout.close();
            System.out.println("file copied successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
			e.printStackTrace();
        }
    }
}
