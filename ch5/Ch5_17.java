package ch5;

import java.util.Scanner;

public class Ch5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer from 1 to 15: ");
		
		int number = input.nextInt();
		input.close();
		
		for(int row = 1; row <= number; row++) {
			for(int space = 0; space < number - row; space++)
				System.out.print("\t");
			int j = row;
			for(;j > 1; j--)
				System.out.print(j +"\t");
			for(; j <= row ; j++)
				System.out.print(j +"\t");
			System.out.println();
		}
	}

}
