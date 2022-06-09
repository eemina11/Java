import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {	
	
	public static void main(String[] args) {
		
		try {
			FileWriter fileObj = new FileWriter("externalfile.txt");
			fileObj.write("I will end up in external file\n");
			fileObj.close();
			System.out.println("Operation done.");
		} catch (IOException fError) {
			System.out.println(fError);
		} finally {
			System.out.println("I am all over the place.");
		}				
	}		
}
