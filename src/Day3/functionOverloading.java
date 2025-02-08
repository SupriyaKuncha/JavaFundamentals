package Day3;

public class functionOverloading {
	
	//calculation of fair
	 // Function to calculate fare based on distance (standard rate)
	public static double calfare(double distance) {
		double ratePerKm = 10.0; // Standard rate per km
        return distance * ratePerKm;
	}
	 // Function to calculate fare based on distance and cab type (SUV or Premium)
    public static double calfare(double distance, String cabType) {
        double ratePerKm = 0.0;
        
        // Determine rate based on cab type
        if (cabType.equalsIgnoreCase("suv")) {
            ratePerKm = 25.0;
        } else if (cabType.equalsIgnoreCase("premium")) {
            ratePerKm = 20.0;
        } else {
            System.out.println("Invalid cab type");
            return -1; // Invalid cab type
        }
        
        return distance * ratePerKm;
    }
    
 // Function to calculate fare based on distance, cab type, and peak time (with surcharge)
    public static double calfare(double distance, String cabType, boolean peakTime) {
        double baseFare = calfare(distance, cabType); // Get fare based on distance and cab type
        if (baseFare == -1) {
            return -1; // Invalid fare due to invalid cab type
        }
        
        if (peakTime) {
            baseFare *= 1.10; // Apply 10% surcharge for peak time
        }
 
        return baseFare;
    }
	public static void main(String[] args) {

	        // Standard fare based on distance only
	        System.out.println("Standard fare: " + calfare(17.9));
	 
	        // Fare based on distance and cab type
	        System.out.println("Fare based on cab type: " + calfare(17.9, "premium"));
	 
	        // Fare with peak time surcharge
	        System.out.println("Fare with peak time surcharge: " + calfare(17.9, "Premium", true));

	}


}
