package ch6;

import java.util.Scanner;

public class Ch6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		input.close();
		
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		
		for(int row = 0; row < n; row++) {
			for(int col = 0; col < n; col++) {
				int bit = (int)(Math.random() * 2);
				
				System.out.print(bit + " ");
			}
			System.out.println();
		}
	}

}
