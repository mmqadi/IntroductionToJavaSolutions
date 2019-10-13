package ch4;
import java.util.Scanner;
public class Ch4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.close();
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		if(!Character.isLetter(letter)) {
			System.out.print(letter + " is an invalid input");
			System.exit(1);
		}
		char letter2 = letter;
		letter = Character.toLowerCase(letter);
		
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println(letter2 + " is a vowel");
		}
		else {
			System.out.println(letter2 + " is a constant");
		}
	}

}
