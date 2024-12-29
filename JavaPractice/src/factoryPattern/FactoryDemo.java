package factoryPattern;

public class FactoryDemo {
	
	public static void main(String[] args) {
		
//		In Factory pattern, we create object without exposing the creation logic to the client
//		and refer to newly created object using a common interface.

		// diff btw factory and strategy is
		// in factory directly interface object is created via child class using input via factory
		
		// where as in strategy
		// here the Object behaviour (loan) gets changed when a diff strategy object is input
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape("circle");
		shape.draw();
		
		shape = factory.getShape("square");
		shape.draw();
		
		shape = factory.getShape("rectangle");
		shape.draw();
	}
}
