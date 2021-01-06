package oop;

public class InnerOuter {
	int x = 90;
	class InnerClass{
		int x = 10;
	}
	
	public static void main(String[] args) {
		InnerOuter io = new InnerOuter();
		System.out.println(io.x);
		InnerOuter.InnerClass ic = io.new InnerClass();
		System.out.println(io.x + ":" + ic.x);
	}

}
