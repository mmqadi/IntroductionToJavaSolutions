package ch3;

import java.util.Scanner;

public class Ch3_32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three points p0, p1 and p2: ");
		double x0 = in.nextDouble();
		double y0 = in.nextDouble();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		in.close();
		
		int position;
		
		double expression = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		position = expression>0?-1:expression==0?0:1;
		
		System.out.println("(" + x2 + ", " + y2 + ") is the " + 
				(position==-1?"left side of":position==0?"on":"right side of") + " the line" + 
				" from (" +x0 + ", " + y0 + ") to ("+ x1 + ", " + y1 + ")");
	}

}
