package net.punktuelles.examples;

public class HelloWorldPlus {

	public static void main(String[] args) {

		HelloWorldPlus meineInstanz = new HelloWorldPlus();
		meineInstanz.printHelloWorld();
		printHelloWorldStatic();
		HelloWorldPlus.printHelloWorldStatic();

	}

	public void printHelloWorld() {
		System.out.println("Hello World from a non-static method!");
	}

	public static void printHelloWorldStatic() {
		System.out.println("Hello World from a static method!");
	}
}
