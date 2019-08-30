package ch2;

import java.util.Scanner;

public class Ch2_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the monthly savings amaount: ");
		double mounthlyAmount = in.nextDouble();
		in.close();
		double total = mounthlyAmount * (1 + 0.00417);
		
		// compute the value for each of the six months in succesion.
		total = (100 + total) *  (1 + 0.00417);
		total = (100 + total) *  (1 + 0.00417);
		total = (100 + total) *  (1 + 0.00417);
		total = (100 + total) *  (1 + 0.00417);
		total = (100 + total) *  (1 + 0.00417);
		System.out.println(total);

	}

}
