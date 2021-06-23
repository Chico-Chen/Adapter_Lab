package Adapter;

import Client.Client;
import Legacy.Audi;
import Legacy.LegacyAPI;

public class MovableAdapterImpl implements MovableAdapter {

	private LegacyAPI car;
	
	public MovableAdapterImpl(LegacyAPI car) {
		this.car = car;
	}
	
	@Override
	public double getSpeedKMPH() {
		// TODO Auto-generated method stub
		return convertMPHToKMPH(car.getSpeed());
	}
	
	@Override
	public double getPricePound() {
		return convertDollarsToPounds(car.getPrice());
	}
	
	private double convertMPHToKMPH(double mph) {
		return mph * 1.60934;
	}
	
	private double convertDollarsToPounds(double dollars) {
		return dollars * 0.72;
	}
	
	public static void demo() {
		LegacyAPI audi = new Audi();
		Client client = new MovableAdapterImpl(audi);
		
		System.out.println("------- Corolla Speed In MPH ------\n");
		System.out.println(audi.getSpeed() + " MPH \n");
		System.out.println("------- Corolla Price In Dollars ------\n");
		System.out.println("$" + audi.getPrice() + "\n");

        System.out.println("============================================\n");


        System.out.println("------- Audi Speed In KMPH ------\n");
		System.out.println(client.getSpeedKMPH() + " KMPH \n");
		System.out.println("------- Audi Price In Pounds ------ \n");
		System.out.println("₤" + client.getPricePound() + "\n");
	}
}
