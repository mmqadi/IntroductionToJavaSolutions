package ch4;

import java.util.Scanner;

public class Ch4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char character = input.nextLine().charAt(0);
		input.close();
		int unicode = (int)character;
		
		System.out.println("The unicode for the character " + character + " is "+ unicode);
	}

}
