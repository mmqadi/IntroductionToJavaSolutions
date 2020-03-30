package ch6;

public class Ch6_28 {

	public static void main(String[] args) {
		
		printMersennePrime();

	}
	
	public static void printMersennePrime() {
		
		System.out.println("p\t\t2^p-1");
		System.out.println("_____________________");
		for(int p = 2; p <= 31; p++) {
			int number = (int)Math.pow(2, p) - 1;
			
			if(isPrime(number)) {
				System.out.println(p + "\t\t" + number);
			}
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
