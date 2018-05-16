package prototype;

public class Square extends Shape {
	public Square() {
		type = "正方形";
	}
	
	@Override
	void draw() {
		System.out.println("正方形");
	}

}
