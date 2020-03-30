package ch6;

public class Ch6_27 {

	public static void main(String[] args) {
		
		printEmirpPrimes();
	}
	
	public static void printEmirpPrimes() {
			
			int number = 2; // number to be tested.
			int emirpCounter = 0; // keeps track of the number of the number of emirp primes discovered.
			
			while(emirpCounter < 100) {
				if(isPrime(number) && isPrime(reverse(number)) && (number != reverse(number))) {
					
					emirpCounter++ ;
					System.out.print(number + "\t");
					
					// if the number of emirp discovered is a multiple of 10. move on to the next line
					if(emirpCounter % 10 == 0)
						System.out.println();
				}
				number++;
			}
		}
	
	public static int reverse(int number) {
		int result = 0;
		
		int xRemaining = Math.abs(number);
		
		while(xRemaining != 0) {
			result = result * 10 + xRemaining % 10;
			xRemaining /= 10;
		}
		
		return number < 0? -result: result;
	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0)
				return false;
		}
		
		return true;
	}
}
