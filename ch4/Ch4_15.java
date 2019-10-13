package ch4;
import java.util.Scanner;
public class Ch4_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		input.close();
		
		if(!Character.isLetter(letter)) {
			System.out.println(letter + " is an invalid input");
			System.exit(1);
		}
		
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
		
		System.out.println("The corresponding number is " + code);
		
	}

}
