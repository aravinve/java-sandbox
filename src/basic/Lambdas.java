package basic;

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;


interface PowerInterface {
	Double power(Integer i);
}

public class Lambdas {
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,34,23234,871,1982);
		numberList.forEach(number -> System.out.println(number));
		Consumer<Integer> consumerMethod = (number) -> {
			if(number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}
		};
		numberList.forEach(consumerMethod);
		PowerInterface p1 = (n) -> Math.pow(n, 1);
		PowerInterface p2 = (n) -> Math.pow(n, 2);
		numberList.forEach(number -> {
			System.out.println(p1.power(number));
			System.out.println(p2.power(number));
		});
	}

}
