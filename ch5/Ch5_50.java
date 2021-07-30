package ch5;

import java.util.Scanner;

public class Ch5_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String userString = input.nextLine();
		input.close();
		
		int count = 0;
		
		for(int i = 0; i < userString.length(); i++) {
			
			char character = userString.charAt(i);
			
			if(character >= 'A' && character <= 'Z')
				count++;
		}
		
		System.out.println("The number of uppercase letters is " + count);
	}

}
