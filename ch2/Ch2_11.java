package ch2;

import java.util.Scanner;

public class Ch2_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int CURRENT_POPULATION = 312032486;
		final double BIRTHS_PER_DAY = 60* 60* 24 /7.0;
		final double DEATHS_PER_DAY = 60* 60* 24 /13.0;
		final double IMIGRANTS_PER_DAY = 60* 60* 24 /45.0;
		
		System.out.print("Enter the number of years: ");
		int years = in.nextInt();
		in.close();
		
		int projection = (int)(CURRENT_POPULATION + (BIRTHS_PER_DAY + IMIGRANTS_PER_DAY - DEATHS_PER_DAY) * 365 * years);
		System.out.print("The population in "+ years + " years is "+projection);
	}

}
