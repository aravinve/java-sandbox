package oop;

public class SampleClass {
	int x = 100;
	
	static String middleName = "Middle";
	
	static void sayHelloAgain() {
		System.out.println("Hello, " + middleName);
	}
	
	public static void main(String[] args) {
		SampleClass s = new SampleClass();
		System.out.println(s.x);
		SampleClass s1 = new SampleClass();
		s1.x = 20;
		// old object
		System.out.println(s.x);
		// another object
		System.out.println(s1.x);
		
		Apples applesObj = new Apples();
		System.out.println(applesObj.firstName);
		System.out.println(applesObj.lastName);
		applesObj.lastName = "Peter";
		System.out.println(applesObj.firstName + applesObj.lastName);
		applesObj.sayHello();
		sayHelloAgain();
		
		User userOne = new User("Man", "Doe");
		userOne.sayHello();
		
		RegularController rc = new RegularController();
		rc.loadMethod();
		rc.printData();
		// cannot create object for abstract class
		// AbstractController ac = new AbstractController();
		
		Animal tiger = new Animal();
		tiger.setName("Mr.Tiger");
		tiger.setCategory("Heavy Weight Champion");
		System.out.println(tiger.getName() + ":" + tiger.getCategory());
		
		RegularControllerInterfacer rci = new RegularControllerInterfacer();
		rci.loadMethod();
		rci.printData();
		
		AwesomeControllerInterfacer aci = new AwesomeControllerInterfacer();
		aci.loadMethod();
		aci.loadMethods();
		aci.printData();
		
		Level l = Level.HIGH;
		System.out.println(l);
		for(Level level : Level.values()) {
			System.out.println(level);
		}
	}
}
