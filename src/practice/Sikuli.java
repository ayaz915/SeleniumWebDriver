package practice;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws Exception {
		
		
		Screen screen = new Screen();
		
		Pattern pattern = new Pattern("/Users/mr.a2z/Desktop/Important Doc/AppStore.png");
		
		screen.click(pattern);

	}

}
