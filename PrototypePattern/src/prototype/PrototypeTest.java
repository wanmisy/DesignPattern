package prototype;

public class PrototypeTest {
	public static void main(String[] args) {
		ShapeCache.loanCatch();
		
		Shape cloneshape = ShapeCache.getShape("1");
		System.out.println(cloneshape.getType());
		
		
		Shape cloneshape2 = ShapeCache.getShape("2");
		System.out.println(cloneshape2.getType());
	}
}
