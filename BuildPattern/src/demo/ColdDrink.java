package demo;

public abstract class ColdDrink implements Item {
	@Override
	public Packaging packaging() {
		return new Bottle();
	}

}
