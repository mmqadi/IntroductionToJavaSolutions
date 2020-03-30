package ch6;

import java.util.Scanner;

public class Ch6_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		
		displaySortedNumbers(a, b, c);
	}
	
	/**
	  I got lazy so I took my solution for exercise 3.8 and changed it a bit.
	 */
	public static void displaySortedNumbers(int a, int b, int c) {
		
		if(a > b && a > c) {
			if(c > b) {
				int temp = b;
				b = c;
				c = temp;
			}
		}
		else if(b > a && b > c) {
			int temp = a;
			a = b;
			b = temp;
			
			if(c > b) {
				temp = b;
				b = c;
				c = temp;
			}
		}
		else {
			int temp = a;
			a = c;
			c = temp;
			
			if(c > b) {
				temp = b;
				b = c;
				c = temp;
			}
		}
		
		System.out.print(c + " " + b + " " + a);
	}
}
