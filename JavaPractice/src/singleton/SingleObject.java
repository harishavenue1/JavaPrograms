package singleton;

public class SingleObject {
	
	// create an object of this class
	private static SingleObject instance = new SingleObject();
	
	// constructor is private so this class cannot be instantiated
	private SingleObject() {};
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Text...");
	}

}
