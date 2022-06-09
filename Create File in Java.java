import java.io.File;
import java.io.IOException;

public class Main {	
	
	public static void main(String[] args) {
		
		try {
			File fileObj = new File("externalfile.txt");
			if (fileObj.createNewFile()) {
				System.out.println("Operation done: " + fileObj.getName());
			} else {
				System.out.println("Check local directory, file with that name exists.");
			}
		}
		
		catch (IOException fError) {
			System.out.println(fError);
		}
		
		finally {
			System.out.println("I am all over the place.");
		}		
	}		
}
