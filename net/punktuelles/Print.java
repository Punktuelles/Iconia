package net.punktuelles;

public class Print {

	public static void p() {
		System.out.println("-----------------------------------");
	}

	public static void p(String s) {
		System.out.println(s);
	}

	public static void p(String s, int line) {

		if (line == 1) {
			System.out.println("-----------------------------------");
			System.out.println(s);
		} else {
			System.out.println("-----------------------------------");
			System.out.println(s);
			System.out.println("-----------------------------------");
		}

	}

}
