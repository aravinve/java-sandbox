package basic;

public class Arrays {
	
	public static void main(String[] args) {
		String[] names = {"goblin", "giant", "dragon", "archer"};
		System.out.println(names);
		
		for(String n: names) {
			System.out.print(n + ",");
		}
		
		System.out.println(names[0]);
		names[0] = "barbarian";
		System.out.println(names[0]);
		
		System.out.println(names.length);
		
		
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i] + ",");
		}
		
		System.out.println();
		
		int[][] twoDArray = {
				{
					1,2,3,4
				}, {
					5,6,7,8
				}
		};
		
		int rowCount = 0;
		for(int[] row: twoDArray) {
			rowCount++;
			for(int data : row) {
				System.out.println(data + ":" + rowCount);
			}
		}
		
	}

}
