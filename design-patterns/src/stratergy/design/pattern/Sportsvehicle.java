package stratergy.design.pattern;

public class Sportsvehicle extends Vehicle {
 
	Sportsvehicle() {
		super(new SportsDriveStratergy());
	}
}
