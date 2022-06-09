enum Options {
	AUDIO,
	VIDEO,
	CONTROLS
}

public class Main {	
	
	public static void main(String[] args) {
		
		for (Options someObj : Options.values()) {
			System.out.println(someObj);
		}
		
		/*
		Options inputObj = Options.VIDEO;
		
		switch(inputObj) {
		case AUDIO:
			System.out.println("Audio Settings");
			break;
		case VIDEO:
			System.out.println("Video Settings");
			break;
		case CONTROLS:
			System.out.println("Joystick and Keyboard Settings");
			break;		
		}*/				
	}		
}