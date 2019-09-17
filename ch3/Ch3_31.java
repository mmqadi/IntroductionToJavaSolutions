package ch3;

import java.util.Scanner;

public class Ch3_31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the exhcange rate from dollars to RMB: ");
		double dollarToYaun = in.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int option = in.nextInt();
		
		if(option == 0) {
			System.out.print("Enter the dollar amount: ");
			double amount = in.nextDouble();
			
			double rmb = amount * dollarToYaun;
			
			System.out.println("$" + amount + " is " + rmb + " yaun");
		}
		else if(option == 1) {
			System.out.print("Enter the RMB amount: ");
			double amount = in.nextDouble();
			
			double dollar = amount / dollarToYaun;
			
			System.out.println(amount + " yuan is $" + dollar);
		}
		else {
			System.out.println("Incorrect input");
		}
		in.close();
	}

}
