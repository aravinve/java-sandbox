package basic;

public class Functions {
	public static void main(String[] args) {
		int score = 100;
		boolean isGameOver = false;
		System.out.println(calcScore(score, isGameOver));
		System.out.println(calcScore(score, true));
		add(1, 2, 3);
		add(1,2);
		add(1);
	}

	private static void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
	private static void add(int i, int j) {
		System.out.println(i+j);
	}
	private static void add(int i) {
		System.out.println(i);
	}

	public static int calcScore(int score, boolean isGameOver) {
		if (isGameOver) {
			score = 1000;
		} else {
			score = 200;
		}
		return score;
	}
}
