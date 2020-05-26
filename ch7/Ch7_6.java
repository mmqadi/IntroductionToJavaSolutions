package ch7;

public class Ch7_6 {

	public static void main(String[] args) {
		
		
		primes();
	}
	
	public static void primes() {
		int primeCount = 1;
		int[] primes = new int[50];
		
		
		int num = 3;
		primes[0] = 2;
		
		while(primeCount < 50) {
			boolean isPrime = true;
			for(int i = 0; i < primeCount; i++) {
				
				if(primes[i] <= (int)(Math.sqrt(num)) && (num % primes[i] == 0)) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				primes[primeCount] = num;
				primeCount++;
			}
			
			num++;
		}
		
		for(int i = 0; i < primes.length; i++) {
			System.out.print(primes[i] +" ");
			if(i % 10 ==0)
				System.out.println();
		}
	}
}
