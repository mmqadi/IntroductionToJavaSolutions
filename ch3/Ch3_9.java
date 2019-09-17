package ch3;

import java.util.Scanner;

public class Ch3_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String numString = in. next();
		int num = Integer.parseInt(numString);
		in.close();
		int d1, d2, d3, d4, d5, d6, d7, d8, d9;
		if(num / 100000000 == 0) {
			d1 = num / 100000000;
		}
		else {
			d1 = 0;
		}
		
		d9 = num % 10;
		num /= 10;
		
		d8 = num % 10;
		num /= 10;
		
		d7 = num % 10;
		num /= 10;
		
		d6 = num %10;
		num /= 10;
		
		d5 = num % 10;
		num /= 10;
		
		d4 = num % 10;
		num /= 10;
		
		d3 = num % 10;
		num /= 10;
		
		d2 = num % 10;
		num /= 10;
		
		d1 = num % 10;
		num /= 10;
		


		int sum = d1 * 1 + d2 * 2 + d3 * 3 + d4 *4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9;
		int checksum = sum % 11;
		
		System.out.print("The ISBN-10 number is " +" "+numString +(checksum == 10?"X":checksum));
	}

}
