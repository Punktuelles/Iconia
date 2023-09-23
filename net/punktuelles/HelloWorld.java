package net.punktuelles;

/**
 * 
 */
import java.util.*;
import java.util.stream.IntStream;

/**
 * 
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Working Directory = " + System.getProperty("user.dir"));

	}

	HelloWorld() {

		System.out.println("Im Konstruktor...");
		var era = new Descendant();

	}

	private int helpMe(Integer... wert) {

		System.out.println(wert.getClass().getTypeName());
		for (Integer i : wert) {
			System.out.println(i.getClass().getTypeName());
		}

		List<List> l = new ArrayList<List>();

		String[] era = new String[42];

		// l.addAll(era); //adding objects
		// l.add("Java");
		// l.add("Tpoint");
		System.out.println(l);

		return 1;
	}

}
