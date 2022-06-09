class InternalOperations {
	int x;
	int y;
	
	public InternalOperations(int a, int b) {
		this.x = a;
		this.y = b;		
	} 	
}

public class Main {	
	
	public static void main(String[] args) {
		
		InternalOperations someObj = new InternalOperations(10, 20); 
						
		System.out.println("X Value: " + someObj.x);
		System.out.println("Y Value: " + someObj.y);
		
		InternalOperations otherObj = new InternalOperations(5, 55); 
		
		System.out.println("X Value: " + otherObj.x);
		System.out.println("Y Value: " + otherObj.y);		
	}	
}