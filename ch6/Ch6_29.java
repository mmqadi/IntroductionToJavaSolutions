package ch6;

public class Ch6_29 {

	public static void main(String[] args) {
		
		printTwinPrime();
	}
	
	public static void printTwinPrime() {
		
		for(int i = 2; i < 1000; i++) {
			if(isPrime(i) && isPrime(i + 2))
				System.out.println("(" + i + "," + (i + 2) + ")");
		}
	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0)
				return false;
		}
		
		return true;
	}

}
