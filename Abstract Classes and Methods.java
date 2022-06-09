//Base.java

public class Base {
	
	private String name;
	
	public void setName(String a) {
		this.name = a;
	}
	
	public String getName() {
		return name;
	}	
}
//Main.java

public class Main {	
	
	public static void main(String[] args) {
		
		Base someObj = new Base();
		someObj.setName("Some Value");
		
		System.out.println(someObj.getName());		
	}		
}
