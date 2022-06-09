import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {

		try {
			File fileObj = new File("externalfile.txt");
			Scanner readFile = new Scanner(fileObj);
			
			while (readFile.hasNextLine()) {
				System.out.println(readFile.nextLine());
			}
			
			readFile.close(); 
			} 
		catch (FileNotFoundException e) {
				System.out.println("This file doesn't exists ");
				System.out.println(e);
			} 
		finally {
				System.out.println("---------------------------");
				System.out.println("I will work no matter what.");
				System.out.println("---------------------------");
			}		
	}		
}
