package StreamMethods;

import java.util.Arrays;
import java.util.List;

public class Demo03 {

	public static void main(String[] args) {
		// Convert from List to Array
		List<String> vehiclesArray = Arrays.asList("Car", "Bike", "Truck", "Bus", "Van", "Car", "Bike");
		
		Object arr[]= vehiclesArray.stream().toArray();
		System.out.println("Array of Vehicles: " + Arrays.toString(arr));
		
		for (Object vehicle : arr) {
			System.out.println("Vehicle: " + vehicle);
		}
		
		// Convert from Array to List
		String[] vehicles = {"Car", "Bike", "Truck", "Bus", "Van", "Car", "Bike"};
		List<String> vehiclesList = Arrays.stream(vehicles).toList();
		System.out.println("List of Vehicles: " + vehiclesList);
		
	}

}
