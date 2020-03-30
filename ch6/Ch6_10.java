package ch6;

public class Ch6_10 {

	public static void main(String[] args) {
		
		int primeCounter = 0;
		
		for(int i = 1; i < 1000; i++) {
			if(isPrime(i)) {
				System.out.print(i + "\t");
				primeCounter++;
				
				if(primeCounter % 10 ==0)
					System.out.println();
			}
			
			
		}
	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++)
			if(number % divisor == 0)
				return false;
		
		return true;
	}

}
