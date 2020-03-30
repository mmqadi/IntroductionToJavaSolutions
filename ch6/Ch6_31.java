package ch6;

import java.util.Scanner;

public class Ch6_31 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a credit card number as a long integer: ");
		long creditNumber = input.nextLong();
		input.close();
		boolean isValid = false;
		
		if(prefixMatched(creditNumber, 4) || prefixMatched(creditNumber, 5) || prefixMatched(creditNumber, 6)
				|| getPrefix(creditNumber, 2) == 37) {
			int sumOfDoubleEven = sumOfDoubleEvenPlace(creditNumber);
			int sumOfOdd = sumOfOddPlace(creditNumber);
			
			int sum = sumOfDoubleEven + sumOfOdd;
			
			isValid = sum % 10 == 0;
		}
		
		System.out.println(creditNumber + " is " + (isValid?"":"in")+"valid");
		
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number) {
		if(number < 10)
			return number;
		else {
			int sum = 0;
			
			do {
				sum = number % 10;
				number /= 10;
				sum += number % 10;
				number = sum;
			}
			while(number >= 10);
			
			return number;
		}
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		return (int)Math.floor(Math.log10(d)) + 1;
	}
	
	/** Return the first k number of digits from number. If the
	* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		if(getSize(number) < k)
			return number;
		else {
			int numberOfDigitsInNumber = getSize(number);
			
			long musk = (long)(Math.pow(10, (numberOfDigitsInNumber - k)));
			return number / musk;
		}
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		
		int sum = 0;
		
		boolean isSecondDigit = false;
		
		while(number != 0) {
			if(isSecondDigit) {
				
				long digit = number % 10;
				int result = (int)(2 * digit);
				
				while(result >= 10)
					result = getDigit(result);
				sum += result;
				isSecondDigit = false;
			}
			else {
				isSecondDigit = true;
			}
			number /= 10;
		}
		
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, 1) == d;
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		boolean isOdd = true;
		int sum = 0;
		
		while(number != 0) {
			if(isOdd) {
				sum += number % 10;
				isOdd = false;
			}
			else 
				isOdd = true;
			
			number /= 10;
		}
		
		return sum;
	}
	
	
}
