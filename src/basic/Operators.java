package basic;

public class Operators {
	public static void main(String[] args) {
		// = + - % / * += -= *= /= == etc. --> example of operators
		int result = 1 + 2;
		System.out.println(result);
		int prev = result;
		result = result - 1;
		System.out.println("Previous" + prev + "Current" + result);
		System.out.println(result += 5);
		System.out.println(result -= 5);
		System.out.println(result *= 5);
		System.out.println(result /= 5);
		System.out.println(result %= 5);
		result++;
		System.out.println(result);
		result--;
		System.out.println(result);

		boolean isBoolean = true;
		if (isBoolean == true) {
			System.out.println("You rock!");
		} else {
			System.out.println("You Suck!");
		}
		isBoolean = false;
		if(isBoolean)
			System.out.println("Helloooooo");
		int score = 200;
		if(score !=0) 
			System.out.println(score);
		if(score < 100) {
			System.out.println("Score is less than 100");
		} else if(score > 100) {
			System.out.println("Score is greater than 100");
		}
		
		if(score > 100 && score < 250)
			System.out.println("Block entered");
		
		if(score > 100 || score-50 > 100) {
			System.out.println("Either one is true");
		}
		if(score > 100 && score-100 > 100) {
			System.out.println("Both are true");
		}
		// Ternary Operator
		boolean isAlien = score == 200 ? true : false;
		System.out.println(isAlien);
		// Left Shift
		System.out.println(4<<2);
		System.out.println(-4<<2);
		// Right Shift
		System.out.println(4>>2);
		System.out.println(-4>>2);
		System.out.println(-4>>>2);
	}
}
