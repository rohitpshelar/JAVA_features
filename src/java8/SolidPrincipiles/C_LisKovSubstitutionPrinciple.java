package java8.SolidPrincipiles;

class Vechile{
	public void start() {
		System.out.println("Start vechile");
	}
	public void stop() {
		System.out.println("Stop vehicle");
	}
}

class Bike extends Vechile{
	public void start() {
		System.out.println("Start Bike");
	}
	public void stop() {
		System.out.println("Stop Bike");
	}
}

class Car extends Vechile{
	public void start() {
		System.out.println("Start Car");
	}
	public void stop() {
		System.out.println("Stop Car");
	}
}


// Object of super class shall be replaced with object of sub class - without breaking the existing logic
public class C_LisKovSubstitutionPrinciple {
	
	static void testDrive(Vechile vechile) {
		vechile.start();
		vechile.stop();
	}
	
	public static void main(String[] args) {
		testDrive(new Vechile());
		testDrive(new Bike());
		testDrive(new Car());
	}

}
