package ch3;
import java.util.Scanner;
public class Ch3_26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int input = in.nextInt();
		in.close();
		
		System.out.println("Is " + input + " divisible by 5 and 6? " + (input % 5 == 0 && input % 6 == 0));
		System.out.println("Is " + input + " divisible by 5 or 6? " + (input % 5 == 0 || input % 6 == 0));
		System.out.println("Is " + input + " divisible by 5 or 6, but not both? " + (input % 5 == 0 ^ input % 6 == 0));
	}

}
