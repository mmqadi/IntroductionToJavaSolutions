package ch5;
import java.util.Scanner;
public class Ch5_48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String userInput = input.nextLine();
		input.close();
		for(int i = 0; i < userInput.length(); i += 2)
			System.out.print(userInput.charAt(i));
	}

}
