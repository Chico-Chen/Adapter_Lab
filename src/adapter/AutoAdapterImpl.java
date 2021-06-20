package adapter;

import lagacy.AutoAPI;
import lagacy.Corolla;

public class AutoAdapterImpl implements AutoAdapterAPI {

	AutoAPI auto;

	public AutoAdapterImpl(AutoAPI auto) {
		super();
		this.auto = auto;
	}

	@Override
	public double getSpeedInKMPH() {
		// TODO Auto-generated method stub
		return auto.getSpeed() * 1.60934;
	}

	@Override
	public double getPriceWithTax() {
		// TODO Auto-generated method stub
		return auto.getPrice() * 1.06;
	}

	public static void demo() {

		AutoAPI auto = new Corolla();

		AutoAdapterAPI autoAdapter = new AutoAdapterImpl(auto);

		System.out.println("------- Corolla Speed In MPH ------");
		System.out.println(auto.getSpeed() + " MPH");
		System.out.println("------- Corolla Price without tax ------");
		System.out.println("$" + auto.getPrice());

		System.out.println();
		System.out.println();

		System.out.println("------- Corolla Speed In KMPH ------");
		System.out.println(autoAdapter.getSpeedInKMPH() + " KMPH");
		System.out.println("------- Corolla Price with tax ------");
		System.out.println("$" + autoAdapter.getPriceWithTax());
		System.out.println();

	}

}
