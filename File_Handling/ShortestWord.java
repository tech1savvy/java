import java.io.*;

public class ShortestWord {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        String shortestWord = null;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+"); // split the line into words

            for (String word : words) {
                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
        }

        System.out.println("Shortest word: " + shortestWord);
    }
}