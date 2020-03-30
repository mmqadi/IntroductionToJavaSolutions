package ch6;

import java.util.Scanner;

public class Ch6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		System.out.print("Is " + number + " a palindrome? " + isPalindrome(number));
	}
	
	public static int reverse(int number) {
		String reverse = "";
		
		while(number != 0) {
			reverse += number % 10;
			number /= 10;
		}
		
		return Integer.parseInt(reverse);
	}
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
