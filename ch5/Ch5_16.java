package ch5;

import java.util.Scanner;

public class Ch5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int factor = 2;
		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();
		
		input.close();
		
		while(num != 0) {
			if(num % factor == 0) {
				num /= factor;
				System.out.print(factor + " ");
			}
			else {
				factor++;
			}
		}
	}

}
