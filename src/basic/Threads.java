package basic;

public class Threads extends Thread {
	private static int x = 10;
	
	public void run() {
		System.out.println("Entered Run Method");
		x++;
		System.out.println("Value of X: " + x);
	}
	
	public static void main(String[] args) {
		Threads t = new Threads();
		t.start();
		while(t.isAlive()) {
			System.out.println("Wait....");
		}
		x++;
		System.out.println("Entered Main Method");
		System.out.println("Value of X: " + x);
	}
	

}
