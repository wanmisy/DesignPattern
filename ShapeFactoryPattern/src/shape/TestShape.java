package shape;

public class TestShape {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();
	}
}
