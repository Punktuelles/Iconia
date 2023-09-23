package net.punktuelles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextRead {

	public void readFileToArray(String filePath) {

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
		}
	}
}
