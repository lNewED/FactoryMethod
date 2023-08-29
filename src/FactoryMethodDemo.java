
public class FactoryMethodDemo {

	public static void main(String[] args) {
	ShapeFactory shapeFactory = new ConcreateShapeFactory();
	
	Shape shape1 = shapeFactory.getShape("circle");
	//Shape shape1 = new Circle();
	shape1.draw();
	}

}
