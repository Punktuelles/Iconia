package net.punktuelles.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextRead {
	
	
	public TextRead(String filePath) {
		
		try {
			FileReader ereader = new FileReader(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			
			FileReader reader = new FileReader(filePath);
		
		} catch (IOException e) {
			//System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
		}
		
		// test, change to deploy
	}
	
	
	public String getUserOrdner() {
		
		return System.getProperty("user.dir");

	}


	public void readFileAndPrint(String filePath) {

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
		}
	}
	
	
	public void readFileToArray(String filePath) {
		
		List<String> liste = new ArrayList<String>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				liste.add(line);
			}
		} catch (IOException e) {
			System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
		}
		
		
		Print.p(liste, 2);
	}
}
