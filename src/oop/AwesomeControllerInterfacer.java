package oop;

public class AwesomeControllerInterfacer implements RegularControllerInterface, AwesomeControllerInterface{

	@Override
	public void printData() {
		// methods considered as unique if same is present in multiple interfaces
		System.out.println("Printing Data From Awesome Controller");
	}

	@Override
	public void loadMethods() {
		System.out.println("Loading Methods From Awesome Controller");
	}

	@Override
	public void loadMethod() {
		System.out.println("Loading Method From Awesome Controller");
	}

}
