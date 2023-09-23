package net.punktuelles;

import java.util.stream.IntStream;

public class Era {

	public static void main(String[] args) {

		Era worker = new Era();

		worker.daten();

		worker.eineFesteAusgabe();

	}

	public void daten() {

		DatenKlasse datenObjekt = new DatenKlasse("Dune", 42);
		Print.p(datenObjekt.name);

	}

	private void intStream() {

		// int [] myIntArray = IntStream.range(0, 100).toArray(); // From 0 to 99
		// int [] myIntArray = IntStream.rangeClosed(0, 100).toArray(); // From 0 to 100
		int[] myIntArray = IntStream.of(12, 25, 36, 85, 28, 96, 47).toArray(); // The order is preserved.
		// int [] myIntArray = IntStream.of(12,36,96,47).sorted().toArray(); // Sort

		for (Integer i : myIntArray) {
			Print.p(i.toString(), 1);
		}

	}

	private void eineFesteAusgabe() {

		Integer objWert = 420;
		var objWertIn = Integer.valueOf(5);
		Print.p(objWert.toString(), 1);
		Print.p(objWert.getClass().toString(), 2);
		Print.p(objWertIn.toString(), 1);
		Print.p(objWertIn.getClass().toString(), 2);

	}

}
