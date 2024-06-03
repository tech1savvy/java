import java.io.*;

public class Search{
    public static void main(String[] args){
        File file = new File("file.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String search = "from";
            
            String line;
            int lineNumber = 0;
            int wordNumber =  0;
            int character;

            boolean found = false;
            while((line = reader.readLine()) != null){
                lineNumber++;
                wordNumber = line.indexOf(search);
                if(wordNumber != -1){
                    found = true;
                }
            }

            if(found){
                System.out.printf("word found at line: %d, index: %d",lineNumber, wordNumber);
            }else{
                System.out.println("word not found");
            }

        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}