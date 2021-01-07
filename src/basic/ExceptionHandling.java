package basic;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			Integer i = 10/0;
			System.out.println(i);
			// throw statement can also be used to catch respective exception
			// throw new ArithmeticException();
		} catch(Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		} finally {
			System.out.println("Finally Block");
		}
	}
}
