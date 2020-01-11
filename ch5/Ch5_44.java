package ch5;

import java.util.Scanner;

public class Ch5_44 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		short number = input.nextShort();
		input.close();
		
		//number = Math.abs(number);
		String shot = "";
		
		for(int i = 0; i < 16; i++) {
			shot = (number & 1) + shot;
			number >>= 1;
		}
		System.out.println("The bits are " + shot);

	}

}
