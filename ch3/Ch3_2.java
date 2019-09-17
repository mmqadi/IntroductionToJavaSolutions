package ch3;

import java.util.Scanner;

public class Ch3_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 14 % 10);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = in.nextInt();
		in.close();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
				(number1 + number2 + number3 == answer));

	}

}
