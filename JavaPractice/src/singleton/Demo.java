package singleton;

public class Demo {
	
	public static void main(String[] args) {
		// cant be created
		// error - The constructor SingleObject() is not visible
		// SingleObject obj = new SingleObject();
	
		SingleObject obj1 = SingleObject.getInstance();
		SingleObject obj2 = SingleObject.getInstance();
		System.out.println("Object 1 "+ obj1);
		System.out.println("Object 2 "+ obj2);
		
		// now both will give same hashiD
	}

}
