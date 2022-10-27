package test.main;

import test.auto.ElecCar;
import test.auto.Engine;
import test.auto.Junkcar;

public class MainClass07 {
	public static void main(String[] args) {
		ElecCar c1 = new ElecCar(new Engine());
		c1.charge();
		c1.drive();
		
		Junkcar j1 = new Junkcar(new Engine());
		
		j1.drive();
		j1.collect();
		j1.collect();
		j1.collect();
		j1.collect();
		j1.sell();
	}
}
