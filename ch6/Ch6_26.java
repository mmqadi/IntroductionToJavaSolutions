package ch6;

public class Ch6_26 {

	public static void main(String[] args) {
		
		printPalidromicPrimes();
		
		
	}
	
	public static void printPalidromicPrimes() {
		
		int number = 2; // number to be tested.
		int palidromicPrimeCounter = 0; // keeps track of the number of the number of palidromic primes discovered.
		
		while(palidromicPrimeCounter < 100) {
			if(isPrime(number) && isPalidrome(number)) {
				
				palidromicPrimeCounter++ ;
				System.out.print(number + "\t");
				
				// if the number of primes discovered is a multiple of 10. move on to the next line
				if(palidromicPrimeCounter % 10 == 0)
					System.out.println();
			}
			number++;
		}
	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0)
				return false;
		}
		
		return true;
	}
	
	/*
	 * returns true if the number is a palindromic
	 * 
	 * function inspired by the solution from a book I read.
	 */
	public static boolean isPalidrome(int number) {
		
		if(number < 0)
			return false; // negative numbers cannot be palindromic.
		
		// get the number of digits the number has
		int numberOfDigits = (int)Math.floor(Math.log10(number)) + 1;
		
		// mask used to extract the most significant digit
		int msdMask = (int)Math.pow(10, numberOfDigits - 1);
		
		for(int i = 0; i < numberOfDigits / 2; i++) {
			if(number / msdMask != number % 10)
				return false;
			
			number %= msdMask; // remove the most significant digit from the number;
			number /= 10; // remove least significant digit in the number;
		}
		return true;
	}
}
