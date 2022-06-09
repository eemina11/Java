import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner someObj = new Scanner(System.in);
		
		System.out.println("------------------");
		System.out.println("Number: ");
		
		int testNumber = someObj.nextInt();
		
		System.out.println("Compare To: ");
		int compareTo = someObj.nextInt();
		
		
		if (testNumber < compareTo) {
			System.out.println(testNumber + " is smaller than " + compareTo);
		} else if (testNumber > compareTo) {
			System.out.println(testNumber + " is greater than " + compareTo);
		} else {
			System.out.println("Equal Numbers");
		}		
		
	}	
}