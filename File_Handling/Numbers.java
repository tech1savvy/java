import java.io.*;
import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            ArrayList<Integer> integers = new ArrayList<>();
            while((line = reader.readLine()) != null){
                for (String number : line.split(",") ) {
                    integers.add(Integer.parseInt(number.trim()));
                }
            }

            System.out.println("Read integers:");
            for (int integer : integers) {
                System.out.printf(integer+" ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}