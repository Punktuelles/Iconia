package net.punktuelles;

import net.punktuelles.helper.Print;
import net.punktuelles.helper.TextRead;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print.p("Hier ist der Launcher", 2);
		
		
		
		reader();
		

	}
	
	
	private static void reader(){
	
		TextRead textRead = new TextRead("/home/era/.test.txt");
		
		String userOrdner = textRead.getUserOrdner();
		
		Print.p("UserOrdner" + userOrdner, 1);
		
}

	
	

}
