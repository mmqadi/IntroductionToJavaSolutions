package ch6;

import java.util.Scanner;

public class Ch6_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		input.close();
		displayPattern(n);

	}
	
	public static void displayPattern(int n) {
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n - i; j++)
				System.out.print("  ");
			
			for(int k = i; k >= 1; k--)
				System.out.print(k + " ");
			
			System.out.println();
		}
	}

}
