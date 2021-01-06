package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Data: ");
			String input = sc.nextLine();
			System.out.println(input);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Wrong Input");
		}
		try {
			System.out.println("Enter another data: ");
			String anotherInput = sc.next();
			System.out.println(anotherInput);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Wrong Input");
		}
		try {
			System.out.println("Enter Number: ");
			int number = sc.nextInt();
			System.out.println(number);
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Wrong Input");
		}
		
		System.out.println("Exit");
		sc.close();
	}
}
