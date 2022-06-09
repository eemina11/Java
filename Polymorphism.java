class Primary {
	public void sameName() {
		System.out.println("I am from Primary Class");
	}
}

class SecondaryA extends Primary {
	public void sameName() {
		System.out.println("I am from SecondaryA Class");
	}	
}

class SecondaryB extends Primary {
	public void sameName() {
		System.out.println("I am from SecondaryB Class");
	}	
}

public class Main {	
	
	public static void main(String[] args) {
		
		Primary primObj = new Primary();
		Primary secAObj = new SecondaryA();
		Primary secBObj = new SecondaryB();		
		
		primObj.sameName();
		secAObj.sameName();
		secBObj.sameName();		
	}		
}
