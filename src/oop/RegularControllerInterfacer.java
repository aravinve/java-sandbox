package oop;

public class RegularControllerInterfacer implements RegularControllerInterface{

	@Override
	public void printData() {
		System.out.println("Printing Data From Regular Controller");
	}

	@Override
	public void loadMethod() {
		System.out.println("Loading Methods From Regular Controller");
	}

}
