package prototype;

public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "矩形";
	}

	@Override
	void draw() {
		System.out.println("画矩形");
	}

}
