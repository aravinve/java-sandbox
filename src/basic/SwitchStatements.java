package basic;

public class SwitchStatements {
	
	public static void dayDetermine(int day) {
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Danger Day");
			break;
		default:
			System.out.println("Don't Know!!");
			break;
		}
	}
	
	public static void main(String[] args) {
		dayDetermine(4);
		dayDetermine(40);
		dayDetermine(0);
		dayDetermine(1);
	}
}
