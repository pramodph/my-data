package stratergy.design.pattern;

public class GoodsVehicle extends Vehicle {
	GoodsVehicle() {
		super(new NormalDriveStratergy());
	}

}
