package Adapter;

import Client.ClientMovable;
import Legacy.Corolla;
import Legacy.LegacyMovable;

public class AdapterMovableImpl implements AdapterMovable{

    LegacyMovable auto;

    public AdapterMovableImpl(LegacyMovable auto){
        this.auto = auto;
    }

    @Override
    public double getSpeedKMPH() {
        // TODO Auto-generated method stub
        return auto.getSpeed() * 1.60934;
    }

    @Override
    public double getPricePound() {
        // TODO Auto-generated method stub
        return auto.getPrice() * 0.72;
    }

    public static void demo() {
        LegacyMovable cor = new Corolla();
        ClientMovable sam = new AdapterMovableImpl(cor);


        System.out.println("------- Corolla Speed In MPH ------\n");
		System.out.println(cor.getSpeed() + " MPH \n");
		System.out.println("------- Corolla Price In Dollars ------\n");
		System.out.println("$" + cor.getPrice() + "\n");

        System.out.println("============================================\n");


        System.out.println("------- Corolla Speed In KMPH ------\n");
		System.out.println(sam.getSpeedKMPH() + " KMPH \n");
		System.out.println("------- Corolla Price In Pounds ------ \n");
		System.out.println("₤" + sam.getPricePound() + "\n");

    }
    
}
