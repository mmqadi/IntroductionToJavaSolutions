package ch5;

import java.util.Scanner;

public class Ch5_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String userString = input.nextLine();
		userString = userString.toLowerCase().replace(" ", "");
		
		input.close();
		int vowelCount = 0;
		
		for(int i = 0; i < userString.length(); i++) {
			char cha = userString.charAt(i);
			
			if(cha == 'a' || cha == 'e' || cha == 'o' || cha == 'i' || cha == 'u') {
				vowelCount++;
			}
		}
		
		System.out.println("The number of vowels is " + vowelCount);
		System.out.println("The number of consonants is " + (userString.length() - vowelCount));
		
	}

}
