public class Main {	
	int x = 10;
	String someString = "Some Value";	
	
	public static void main(String[] args) {
		Main firstObj = new Main();
		Main secondObj = new Main();
		Main thirdObj = new Main();
		
		System.out.println(firstObj.x);
		
		System.out.println(secondObj.x);
		
		firstObj.x = 555;
		
		System.out.println(firstObj.x);
		
		System.out.println(thirdObj.someString);					
	}	
}
