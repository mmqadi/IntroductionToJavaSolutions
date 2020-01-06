package ch5;

public class Ch5_23 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		double n = 50000.0;
		
		// calculate from left to right;
		for(double i = 1.0; i <= n; i= i+1)
			sum += 1/i;
		
		System.out.println("from left to right: " + sum);
		
		sum = 0;
		
		for(double i = n; i >=1; i = i-1)
			sum += 1/i;
		
		System.out.println("from right to left: " + sum);
	}

}
