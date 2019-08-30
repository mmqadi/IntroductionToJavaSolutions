package ch2;
/*
 * (Convert pounds into kilograms) Write a program that converts pounds into kilo-
 * grams. The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
 * sample run:
 */
import java.util.Scanner;

public class Ch2_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pound = in.nextDouble();
		double killo = 0.454 * pound;
		System.out.println(pound + " pounds is " + killo +killo + " kilograms");
	}

}
