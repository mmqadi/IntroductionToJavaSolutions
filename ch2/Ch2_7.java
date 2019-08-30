package ch2;

import java.util.Scanner;

public class Ch2_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minutes = in.nextInt();
		int temp = minutes;
		int days = minutes / 1440;
		minutes = minutes / 1440;
		int years = days / 365;
		days = days % 365;	
		
		
		System.out.print(temp + " minutes is aprox. " + years + " and " + days + " days");

	}

}
