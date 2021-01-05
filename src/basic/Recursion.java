package basic;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(calcFactorial(5));
		System.out.println(calcFactorial(8));
		System.out.println(seriesSum(10));
	}
	
	private static int seriesSum(int n) {
		if(n > 0) {
			return n + seriesSum(n - 1);
		} else {
			return 0;
		}
	}
	
	private static int calcFactorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * calcFactorial(n - 1);
		}
	}
}
