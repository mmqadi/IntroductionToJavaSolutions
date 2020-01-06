package ch5;

public class Ch5_26 {

	public static void main(String[] args) {
		
		double e = 1, item = 1;
		
		for(double i = 2; i <= 10000; i++) {
			e += item;
			item = item / i;
			
		}
		
		System.out.println("e is aprox. " + e);
	

		
	 e = 1; item = 1;
		
		for(double i = 2; i <= 20000; i++) {
			e += item;
			item = item / i;
			
		}
		
		System.out.println("e is aprox. " + e);
		
	 e = 1; item = 1;
		
		for(double i = 2; i <= 100000; i++) {
			e += item;
			item = item / i;
			
		}
		
		System.out.println("e is aprox. " + e);
	}
	
	

}
