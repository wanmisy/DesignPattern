package prototype;


public class Circle extends Shape {
	public Circle() {
		type = "圆形";
	}

	@Override
	void draw() {
		System.out.println("画圆形");
	}
}
