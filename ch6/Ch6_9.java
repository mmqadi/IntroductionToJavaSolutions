package ch6;

public class Ch6_9 {

	public static void main(String[] args) {
		
		
		System.out.println("Feet\t\tMeter\t\t|\t\tMeter\t\tFeet");
		
		for(double feet = 1.0, meter = 20.0; feet <= 10.0 && meter <= 65.0; feet++, meter = meter+5.0) {
			System.out.printf("%s\t\t%.3f\t\t|\t\t%s\t\t%.3f\n", feet, footToMeter(feet), meter, meterToFoot(meter));
		}


	}
	
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}
	
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}

}
