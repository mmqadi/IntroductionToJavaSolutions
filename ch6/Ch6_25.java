package ch6;

import java.util.Scanner;

public class Ch6_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time in milliseconds: ");
		long millis = input.nextLong();
		input.close();
		
		System.out.println("The time in H:M:S is: " + convertMillis(millis));

	}
	
	public static String convertMillis(long millis) {
		long seconds = millis / 1000;
		
		
		long hours = seconds / 3600;
		seconds %= 3600;
		
		long minutes = seconds / 60;
		seconds %= 60;
		
		return hours + ":" + minutes + ":" + seconds;
		
	}
}
