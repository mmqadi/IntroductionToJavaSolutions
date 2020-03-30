package ch6;

import java.util.Scanner;

public class Ch6_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		System.out.print("The number " + number + " in reverse is ");
		reverse(number);
	}
	
	public static void reverse(int number) {
		
		while(number != 0) {
			System.out.print(number % 10);
			number /= 10;
		}
	}
}
