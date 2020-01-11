package ch5;

import java.util.Scanner;

public class Ch5_38 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive decimal integer: ");
		int decimal = input.nextInt();
		input.close();
		
		String octal = "";
		
		while(decimal != 0) {
			octal = decimal % 8 + octal;
			decimal /= 8;
		}
		
		System.out.println("The binary representation is " + octal);

	}
}
