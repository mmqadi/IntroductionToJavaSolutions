package ch5;

import java.util.Scanner;

public class Ch5_46 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.next();
		input.close();
		for(int i = string.length() - 1; i >= 0; i--)
			System.out.print(string.charAt(i));

	}

}
