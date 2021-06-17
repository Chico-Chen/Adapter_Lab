package Legacy;

import Client.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable car;
	
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHToKMPH(car.getSpeed());
	}
	
	@Override
	public double getPrice() {
		return convertDollarsToPounds(car.getPrice());
	}
	
	private double convertMPHToKMPH(double mph) {
		return mph * 1.60934;
	}
	
	private double convertDollarsToPounds(double dollars) {
		return dollars * 0.72;
	}
	
}
