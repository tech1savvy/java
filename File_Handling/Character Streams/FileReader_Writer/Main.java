import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Reader and Writer Abstract Classes
// are concretely implemented in 

// FileReader, FileWriter Classes, and
// - read, write char by char

// BufferedReader, BufferedWriter Classes
// - read, write in chunks of chars
// - more efficent and faster

public class Main{
    public static void main(String[] args) {
        try {

            File file = new File("file.txt");

            // write
            FileWriter writer = new FileWriter(file);
            writer.write("hello from file.txt");
            writer.close(); // one must be closed before using the other

            // append
            FileWriter append = new FileWriter(file, true);
            // true indicates append mode
            append.write("\nworld");
            append.close();

            // read
            FileReader reader = new FileReader(file);
            int character;
            while((character = reader.read()) != -1){
                // -1 means end of file is reached
                System.out.print((char)character);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
			e.printStackTrace();
        }
    }
}
