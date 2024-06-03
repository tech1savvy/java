import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File file = new File("file.txt");
		try{

			if(!file.exists()){
				System.out.println("file does not exist");
				return;
			}

			// create file
			if(file.createNewFile()){
				// returns true if file created
				System.out.println("file created");
			} else{
				System.out.println("file already exists or error creating file");
			}

			// delete file
			if(file.delete()){
				System.out.println("file deleted");
			}else{
				System.out.println("failed to delte file");
			}
		} catch(IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}