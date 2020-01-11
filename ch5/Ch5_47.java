package ch5;

import java.util.Scanner;

public class Ch5_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.next();
		
		input.close();
		
		if(isbn.length() != 12) {
			System.out.println(isbn + " is an invalid input");
			System.exit(1);
		}
		int sum = 0;
		
		for(int i = 0; i < isbn.length(); i++) {
			
			if( i % 2 == 1)
				sum += Integer.parseInt(isbn.charAt(i) + "") * 3;
			else
				sum += Integer.parseInt(isbn.charAt(i) + "");
		}
		
		int digit = 10 - sum % 10;
		
		System.out.println("The ISBN-13 number is " + isbn + (digit == 10?"0":digit));
	}

}
