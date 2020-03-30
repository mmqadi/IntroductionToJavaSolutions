package ch6;

import java.util.Scanner;

public class Ch6_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.print("Enter a character whose accurances you want to count: ");
		char character = input.next().charAt(0);
		input.close();
		
		System.out.println("\""+ character + "\" accurs " + count(s, character) + " times in \"" + s + "\"");

	}
	
	
	public static int count(String str, char c) {
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == c)
				count++;
		
		return count;
	}

}
