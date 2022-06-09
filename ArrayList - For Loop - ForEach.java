import java.util.ArrayList;
import java.util.Collections;

public class Main {	
	
	public static void main(String[] args) {
		
		ArrayList<String> pLanguages = new ArrayList<String>();
		
		pLanguages.add("Lisp");
		pLanguages.add("Java");
		pLanguages.add("Python");
		pLanguages.add("C++");
		pLanguages.add("Ada");
		
		System.out.println(pLanguages); 
		
		//System.out.println("Number of elements: " + pLanguages.size());
		
		Collections.sort(pLanguages);
		
		for (String x : pLanguages) {
			System.out.println(x);
		}
		
		/*
		for (int x = 0; x < pLanguages.size(); x++) {
			System.out.println("Index: " + x + " " + pLanguages.get(x));
		}
		*/
	}		
}