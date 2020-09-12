package basic;

public class IfElse {

	public static void main(String[] args) {
		int score = 5000;
		if(score == 5000)
			System.out.println("Score is: " + score);
			score = 4000;
		System.out.println("Score is: " + score);
		boolean flag = false;
		if(flag) {
			System.out.println("Flag is true");
		} else {
			System.out.println("Flag is false");
		}
		
		double d = 3400;
		if(d < 10000) {
			if(d < 5000 && d > 2000) {
				System.out.println("Entered here");
				d = 400;
			}
		} else{
			System.out.println("Danger Danger");
		}
		if(d < 200) {
			System.out.println(":Less than 200");
		} else if(d > 400) {
			System.out.println("greater than 400");
		} else if(d == 400) {
			System.out.println("D is 400");
		} else {
			System.out.println("Danger DNger");
		}
	}
}
