import java.util.HashSet;

public class Main {	
	
	public static void main(String[] args) {
		
		HashSet<String> monitors = new HashSet<String>();
		
		monitors.add("Dell");
		monitors.add("IBM");
		monitors.add("Benq");		
		
		System.out.println(monitors);
		
		//Size
		System.out.println("Set Size: " + monitors.size());

		//Check for element
		System.out.println("Set Size: " + monitors.contains("Dell"));
		
		//Get all elements
		for (String x : monitors) {
			System.out.println(x);
		}
		
		//Remove element
		monitors.remove("Benq");
		System.out.println(monitors);
		
		//Clear all elements
		monitors.clear();
		System.out.println(monitors);		
	}		
}