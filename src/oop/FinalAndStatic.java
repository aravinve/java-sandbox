package oop;

public class FinalAndStatic {
	final int c = 10;
	static int d = 20;
	
	private static String ping() {
		return "pong";
	}
	
	public static void main(String[] args) {
		FinalAndStatic fObj = new FinalAndStatic();
		// can be accessed without object
		System.out.println(d);
		System.out.println(fObj.c);
		System.out.println(fObj.d);
		fObj.d = 700;
		d = 900;
		// final variable cannot be modified
		// c = 500;
		// static variable if modified remains static always
		System.out.println(d);
		System.out.println(fObj.d);
		// static methods
		String out = ping();
		System.out.println(out);
	}
}
