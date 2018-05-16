package demo;

public abstract class Burge implements Item {

	@Override
	public Packaging packaging() {
		return new Wrapper();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}
}
