class OutsiderClass {
	
	public void outsiderMethod() {
		System.out.println("I am from outsiderMethod");
	}
	
	class InsiderClass {
		
		public void insiderMethod() {
			System.out.println("I am from insiderMethod");
		}
	}
}

public class Main {	
	
	public static void main(String[] args) {
		
		OutsiderClass outObj = new OutsiderClass();
		outObj.outsiderMethod();
		
		OutsiderClass.InsiderClass inObj = outObj.new InsiderClass();
		inObj.insiderMethod();		
	}		
}