package abstractfactory;


public class ShapeFactory extends AbstractFactory {
	// getShapre()方法获取画图形的形状
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		} else if ("CIRCLE".equals(shapeType)) {
			return new Circle();
		} else if ("SQUARE".equals(shapeType)) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		return null;
	}
}
