package stratergy.design.pattern;

public class Vehicle {

	DriverStratergy driverStratergy;
	
	Vehicle(DriverStratergy driverStratergy) {
		this.driverStratergy = driverStratergy;
	}
	
	public void drive() {
		driverStratergy.drive();
	}
}
