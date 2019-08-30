package ch2;

import java.util.Scanner;

public class Ch2_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter x1, and y1: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		
		System.out.print("Enter x2, and y2: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		in.close();
		
		double sqrdX = (x2 - x1) * (x2 - x1);
		double sqrdY = (y2 - y1) * (y2 - y1);
		
		double distance = Math.sqrt(sqrdX + sqrdY);
		
		System.out.println("The distance between the two points is " + distance);
	}

}
