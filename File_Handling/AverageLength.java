import java.io.*;

public class AverageLength {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        int totalLength = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalLength += line.length();
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double averageLength = (double) totalLength / lineCount;
        System.out.println("Average length of lines: " + averageLength);
    }
}