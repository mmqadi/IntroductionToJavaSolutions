package ch6;

import java.util.Scanner;

public class Ch6_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a passowrd: ");
		String s = input.nextLine();
		
		input.close();
		System.out.print(isValidPassword(s)?"Valid Password": "Invalid Password");
	}
	
	public static boolean isValidPassword(String s) {
		return atLeastEeight(s) && onlyLettersOrDigits(s) && atLeastTwoDigits(s);
	}
	
	public static boolean atLeastEeight(String s) {
		return s.matches(".{8,}");
	}
	
	public static boolean onlyLettersOrDigits(String s) {
		return s.matches("[\\w\\d]+");
	}
	
	public static boolean atLeastTwoDigits(String s) {
		return s.matches(".*[\\d]{2,}.+");
	}

}
