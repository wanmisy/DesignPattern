package bridge;

public class GreenCiclr implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("green " + "radius: "+radius  +" ;x:"+x + ";y:"+y);
	}

}
