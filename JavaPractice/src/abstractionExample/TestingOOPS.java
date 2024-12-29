package abstractionExample;

public class TestingOOPS {
	public static void main(String[] args) {
		Shape s1 = new AbstractClassCircle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);

		// if I try to know implementation of below methods I cant see -> this is abstraction
		// because I have ref of abstract class, but implementation logic is in child class
		// child class implementation wont be seen, as ref is to main parent class
		System.out.println(s1.toString()); 
		System.out.println(s2.toString());
	}
}