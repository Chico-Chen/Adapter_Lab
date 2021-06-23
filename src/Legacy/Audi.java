package Legacy;

public class Audi implements LegacyAPI {
	private double speed;
	private double price;
	
	{
		this.speed = 200;
		this.price = 20000;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
