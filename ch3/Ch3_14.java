package ch3;
import java.util.Scanner;

public class Ch3_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int coin = (int)(Math.random() * 2);
		
		System.out.print("Guess the face of the coin, head(0) or tail(1): ");
		int guess = in.nextInt();
		in.close();
		
		System.out.println("You are " + (guess == coin?"":"in")+ "correct!");
	}

}
