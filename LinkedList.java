import java.util.LinkedList;

public class Main {	
	
	public static void main(String[] args) {
		
		LinkedList<String> pLanguages = new LinkedList<String>();
		
		pLanguages.add("Java");
		pLanguages.add("Lisp");
		pLanguages.add("C++");
		
		System.out.println(pLanguages);
		
		//Adding Stuff
		pLanguages.addFirst("Prolog");
		System.out.println(pLanguages);
		
		pLanguages.addLast("Ada");
		System.out.println(pLanguages);
		
		//Get Stuff
		
		System.out.println("First Element: " + pLanguages.getFirst());
		System.out.println("Last Element: " + pLanguages.getLast());
		System.out.println(pLanguages);
		
		//Remove Stuff
		pLanguages.removeFirst();
		pLanguages.removeLast();
		System.out.println(pLanguages);		
	}		
}