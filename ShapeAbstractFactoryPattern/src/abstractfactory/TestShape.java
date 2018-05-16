package abstractfactory;

public class TestShape {
	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory shapeFactory = factoryProducer.getFactory("SHAPE");
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();
		
		AbstractFactory colorFactory = factoryProducer.getFactory("COLOR");
		Color color = colorFactory.getColor("RED");
		color.file();
		
	}
}
