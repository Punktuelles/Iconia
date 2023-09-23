package net.punktuelles;

public class HelloWorldPlus {

	public static void main(String[] args) {
		
		HelloWorldPlus meineInstanz = new HelloWorldPlus();
		meineInstanz.printHelloWorld();

		// Aufruf der statischen Methode ohne Instanziierung
		printMessage("This is a static method.");
	}

	public void printHelloWorld() {
		System.out.println("Hello World from a non-static method!");
	}

	public static void printMessage(String message) {
		System.out.println(message);
	}
}
