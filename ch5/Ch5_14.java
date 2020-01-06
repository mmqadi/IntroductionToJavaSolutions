package ch5;

import java.util.Scanner;

public class Ch5_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two positive intergers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		input.close();
		
		int divisor = (n1 <= n2? n1:n2);
		
		for(int i = divisor; i > 1; i--) {
			if(n1 % i == 0 && n2 % i == 0) {
				divisor = i;
				break;
			}
				
		}
		
		System.out.println("THe greatest common divisor is " + divisor);
	}

}
