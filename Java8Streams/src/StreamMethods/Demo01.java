package StreamMethods;

import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		List<String> vehicles = List.of("Car", "Bike", "Truck", "Bus", "Van","Car","Bike");
		// Using distinct() to remove duplicates
		List<String> distinctVehicles = vehicles.stream()
				.distinct().toList();
		System.out.println("Distinct Vehicles: " + distinctVehicles);
		
		// Limiting the stream to the first 3 elements
		List<String> limitedVehicles = vehicles.stream()
				.limit(3).toList();
		System.out.println("Limited Vehicles: " + limitedVehicles);
		
		// Skipping the first 2 elements
		List<String> skippedVehicles = vehicles.stream()
				.skip(2).toList();
		System.out.println("Skipped Vehicles: " + skippedVehicles);
		
		// Combining distinct, limit, and skip
		List<String> combinedVehicles = vehicles.stream()
				.distinct()
				.limit(4)
				.skip(1)
				.toList();
		System.out.println("Combined Vehicles: " + combinedVehicles);
		
		// Using sorted() to sort the stream
		List<String> sortedVehicles = vehicles.stream()
				.sorted().toList();
		System.out.println("Sorted Vehicles: " + sortedVehicles);
		
		//counting the number of distinct vehicles
		long countDistinctVehicles = vehicles.stream()
				.distinct()
				.count();
		System.out.println("Count of Distinct Vehicles: " + countDistinctVehicles);
		
		// Using findFirst() to get the first element
		String firstVehicle = vehicles.stream()
				.findFirst()
				.orElse("No vehicles found");
		System.out.println("First Vehicle: " + firstVehicle);
		
		// Find duplicates vehicles in the list
		List<String> duplicateVehicles = vehicles.stream()
				.filter(vehicle -> vehicles.stream().filter(v -> v.equals(vehicle)).count() > 1)
				.distinct()
				.toList();	
			
		System.out.println("Duplicate Vehicles: " + duplicateVehicles);
		
		// find the vehicle count with length greather than or equal to 3
		long countVehiclesWithLengthGreaterThanOrEqualTo3 = vehicles.stream()
				.filter(vehicle -> vehicle.length() >= 3)
				.count();
		System.out.println("Count of Vehicles with length >= 3: " + countVehiclesWithLengthGreaterThanOrEqualTo3);
		
		
	}

}
