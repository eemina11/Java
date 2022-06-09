public class Main {

	public static void main(String[] args) {
								
		 String[] progLang = {"Java", "C++", "Python", "Perl", "Lisp"};
		 int[] numbers = {1, 3, 5, 25, 5000};
		 
		 System.out.println("Language at Pos 0: " + progLang[0]);
		 System.out.println("Number at Pos 0: " + numbers[0]);
		 
		 System.out.println("Language at Pos 4: " + progLang[4]);
		 
		 //Change elements
		 
		 progLang[0] = "Prolog";
		 System.out.println("Language at Pos 0: " + progLang[0]);
		 
		 numbers[0] = 10000;
		 System.out.println("Number at Pos 0: " + numbers[0]);
		 
		 //Length of Array - Number of elements:
		 
		 System.out.println("Num of ProgLangs: " + progLang.length);
		 System.out.println("Num of Numbers: " + numbers.length);
		 
		 for (String x: progLang) {
			 System.out.println(x);
		 }		
	}	
}