package ch5;

import java.util.Scanner;

public class Ch5_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive decimal integer: ");
		int decimal = input.nextInt();
		input.close();
		
		String binary = "";
		
		while(decimal != 0) {
			binary = decimal % 2 + binary;
			decimal /= 2;
		}
		
		System.out.println("The binary representation is " + binary);

	}

}
