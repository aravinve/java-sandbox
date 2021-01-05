package basic;

public class Loops {
	
	public static void main(String[] args) {
		// While Loop
		int x = 10;
		while(x >= 0) {
			System.out.println(x);
			x--;
		}
		
		// Do while loop
		int c = 23;
		do {
			// executed at least once
			System.out.println(c);
		} while(c > 25);
		
		// for loop
		for(int i=0;i<5;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// for loop another sample
		for(int i=10;i>=0;i-=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// for each loop
		String s = "Aravind";
		for(char ch : s.toCharArray()) {
			System.out.print(ch + ",");
		}
		
		System.out.println();
		
		String[] arrays = {"a", "b", "c"};
		for(String a: arrays) {
			System.out.print(a + ",");
		}
		
		System.out.println();
		
		// break usage
		for(int i=0;i<10;i++) {
			if(i == 3) {
				break;
			}
			System.out.print(i);
		}
		
		System.out.println();
		
		// continue usage
		for(int i=0;i<10;i++) {
			if(i == 3) {
				continue;
			}
			System.out.print(i);
		}
		
	}

}
