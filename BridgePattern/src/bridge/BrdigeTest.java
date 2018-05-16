package bridge;

public class BrdigeTest {
	public static void main(String[] args) {
		Shape shape = new Circle(100, 100, 10, new RedCircle());
		shape.draw();
	}
}
