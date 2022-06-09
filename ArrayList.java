import java.util.ArrayList;

public class Main {	
	
	public static void main(String[] args) {
		
		ArrayList<String> pLanguages = new ArrayList<String>();
		
		pLanguages.add("Lisp");
		pLanguages.add("Java");
		pLanguages.add("Python");
		pLanguages.add("C++");
		
		System.out.println(pLanguages); //get all elements
		System.out.println(pLanguages.get(0));	 //get by index
		
		pLanguages.set(0, "Prolog"); //change by index
		System.out.println(pLanguages);
		
		pLanguages.remove(0); //remove element
		System.out.println(pLanguages);
		
		pLanguages.clear(); //delete all elements
		System.out.println(pLanguages);
		
		pLanguages.add("Perl");
		System.out.println(pLanguages);
	}		
}
