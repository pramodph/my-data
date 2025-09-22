package stratergy.design.pattern;

public class NormalVehicle extends Vehicle {

	public NormalVehicle() {
		super(new NormalDriveStratergy());
	}

}
