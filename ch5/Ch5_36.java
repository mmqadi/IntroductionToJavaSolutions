package ch5;

import java.util.Scanner;

public class Ch5_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		input.close();
		String isbn = input.next();
		
		int sum = 0;
		
		for(int i = 0; i < isbn.length(); i++) {
			sum += Integer.parseInt(isbn.charAt(i) + "") * (i+1);
		}
		
		int digit = sum % 11;
		
		System.out.println("The ISBN-10 number is " + isbn + (digit == 10?"X":digit));
		
	}

}
