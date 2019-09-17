package ch3;

import java.util.Scanner;

public class Ch3_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = in.nextInt();
		in.close();
		
		int d2 = number % 10;
		
		int d1 = number /100;
		
		System.out.print(number + " is "+ (d1 == d2?"a palidrome": "not a palidrome"));

	}

}
