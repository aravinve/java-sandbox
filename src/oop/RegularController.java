package oop;

public class RegularController extends AbstractController {
	public RegularController() {
		loadMethod();
	}

	@Override
	public void printData() {
		System.out.println("Printing Data: By Regular Controller");
	}
	
	/**
	 * The below method can be uncommented to 
	 * re-implement the abstract class functionality.
	 */
	
//	public void loadMethod() {
//		System.out.println("Loading Regular Class Methods");
//	}
}
