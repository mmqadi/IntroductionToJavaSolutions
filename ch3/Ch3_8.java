package ch3;

import java.util.Scanner;

public class Ch3_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		
		if(a > b && a > c) {
			if(c > b) {
				int temp = b;
				b = c;
				c = temp;
			}
		}
		else if(b > a && b > c) {
			int temp = a;
			a = b;
			b = temp;
			
			if(c > b) {
				temp = b;
				b = c;
				c = temp;
			}
		}
		else {
			int temp = a;
			a = c;
			c = temp;
			
			if(c > b) {
				temp = b;
				b = c;
				c = temp;
			}
		}
		
		System.out.print(a + " " + b + " " + c);
	}

}
