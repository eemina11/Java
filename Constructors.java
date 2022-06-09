public class Main {
	
	int x; 
	
	//This is Constructor - same name as Class name
	public Main() {
		x = 10;
	}	
			
	public static void main(String[] args) {
		
		Main newObj = new Main();
		
		System.out.println(newObj.x);
		
		newObj.x = 555;
		
		System.out.println(newObj.x);					
	}	
}