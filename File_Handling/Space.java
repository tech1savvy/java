import java.io.*;

public class Space{
    public static void main(String[] args){
        File file = new File("file.txt");
        if(!file.exists()){
            System.out.println("file does not exists");
            try{
                if(file.createNewFile()){
                System.out.println("file created");
                }else{
                    System.out.println("file creation failed");
                }
            }catch(IOException i){
                System.out.print(i.getMessage());
                i.printStackTrace();
            }
        }else{
            try{
                BufferedReader reader = new BufferedReader(new FileReader(file));
                int character;
                while((character = reader.read()) != -1){
                    System.out.printf((char) character + " ");
                }
                System.out.println();
                reader.close();
            }catch(IOException i){
                System.out.println(i.getMessage());
                i.printStackTrace();
            }
        }
    }
}