class Primary {
	
	public void sameName() {
		System.out.println("I am from Primary Class");
	}
}

class Secondary extends Primary {
	
	public void sameName() {
		super.sameName();
		System.out.println("I am from Secondary Class");
	}	
}

public class Main {	
	
	public static void main(String[] args) {
		
		//Primary primObj = new Primary();
		//primObj.sameName();
		
		Secondary secObj = new Secondary();
		secObj.sameName();		
	}	
}
