package StreamMethods;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo04 {

	public static void main(String[] args) {
		// Sorting List the ASC-DSC
	   List<String> vehicles = List.of("Car", "Bike", "Truck", "Bus", "Van", "Car", "Bike");
	   List<String> sortedVehiclesAsc = vehicles.stream().sorted().toList();
	   System.out.println("Sorted Vehicles in Ascending Order: " + sortedVehiclesAsc);
	   				
	   				
	   // Sorting List in Descending Order
	   // Using Comparator.reverseOrder() for descending order
   	   // or using a custom comparator
	   List<String> sortedVehiclesDsc = vehicles.stream().sorted((v1, v2) -> v2.compareTo(v1)).toList();
	   				System.out.println("Sorted Vehicles in Descending Order: " + sortedVehiclesDsc);
	   				
	   	//Using Comparator.reverseOrder()
	   	List<String> sortedVehiclesDsc2 = vehicles.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	   	System.out.println("Sorted Vehicles in Descending Order using Comparator: " + sortedVehiclesDsc2);
	}

}
