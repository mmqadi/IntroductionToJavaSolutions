package ch6;

public class Ch6_2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			long integer = (long)(100 + Math.random() * 9900);
			
			System.out.println("The sum of digits for integer " + integer + " is " + sumDigits(integer));
		}
	}
	
	public static int sumDigits(long n) {
		
		int sum = 0;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}
