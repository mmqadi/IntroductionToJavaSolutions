package ch7;

import java.util.Scanner;

public class Ch7_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter five numbers: ");
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		
		System.out.print("The greatest common the divisor is: "  + gcd(numbers));
		input.close();
	}
	
	public static int gcd(int... numbers) {
		
		int min = getMin(numbers);
		
		for(int i = min; i > 0; i--) {
			boolean dividesAll = true;
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[j] % i != 0)
					dividesAll = false;
			}
			
			if(dividesAll)
				return i;
		}
		
		return 1;
	}
	
	public static int getMin(int... numbers) {
		
		int min = numbers[0];
		
		
		for(int num: numbers) {
			if(num < min)
				min = num;
		}
		
		return min;
	}

}
