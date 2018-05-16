package shape;

public class ShapeFactory {
	// getShapre()方法获取画图形的形状
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
}
