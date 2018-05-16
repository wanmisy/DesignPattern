package prototype;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape shapeCatch = shapeMap.get(shapeId);
		return (Shape) shapeCatch.clone();
	}
	
	
	// 对每种都运行数据库查询，并创建该对象
	// shapeMap.put(key, value);
	// 例如我们要创建三种形状
	public static void loanCatch() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);
	}
	
}
