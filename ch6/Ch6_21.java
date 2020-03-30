package ch6;

import java.util.Scanner;

public class Ch6_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		String s2 = "";
		
		input.close();
		
		// go through every character in the input string and convert every letter you find.	
		for(int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			
			if(Character.isLetter(letter))
				s2 += Integer.toString(getNumber(letter));
			else
				s2 += Character.toString(letter);
		}
		
		System.out.println(s2);
	}
	
	
	/**
	 * Convert letter to an integer representation based on the phone keypads
	 * @param letter letter to be converted
	 * @return the integer that the letter is mapped to.
	 */
	public static int getNumber(char letter) {
		letter = Character.toLowerCase(letter);
		int code = 0;
		
		if(letter >= 'a' && letter <= 'c')
			code = 2;
		if(letter >= 'd' && letter <= 'f')
			code = 3;
		if(letter >= 'g' && letter <= 'i')
			code = 4;
		if(letter >= 'j' && letter <= 'l')
			code = 5;
		if(letter >= 'm' && letter <= 'o')
			code = 6;
		if(letter >= 'p' && letter <= 's')
			code = 7;
		if(letter >= 't' && letter <= 'v')
			code = 8;
		if(letter >= 'w' && letter <= 'z')
			code = 9;
		
		return code;
	}

}
