package basic;

public class Strings {

	public static void main(String[] args) {
		String greeting = "Hello";
		System.out.println(greeting);
		System.out.println("Length: " + greeting.length());
		System.out.println(greeting.toLowerCase());
		System.out.println(greeting.toUpperCase());
		String txt = "Please locate me !!";
		System.out.println(txt.indexOf("locate"));
		// Not found means -1
		System.out.println(txt.indexOf("index"));
		String firstName = "Aravind";
		String lastName = "Rocker";
		System.out.println(firstName + "Rocker");
		System.out.println("Aravind".concat(lastName));
		
		String message = "The King in the \"North\"";
		System.out.println(message);
	}
	
}
