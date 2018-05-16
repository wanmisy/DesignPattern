package abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		} else if ("RED".equals(colorType)) {
			return new Red();
		} else if ("GREEN".equals(colorType)) {
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
