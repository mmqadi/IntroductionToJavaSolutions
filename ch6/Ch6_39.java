package ch6;

import java.util.Scanner;

public class Ch6_39 {

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
		
		System.out.print("("+ x2 + ", " + y2 + ") is on ");
		String str = "";
		if(leftOfTheLine(x0, y0, x1, y1, x2, y2))
			str = "left of";
		else if(onTheSameLine(x0, y0, x1, y1, x2, y2))
			str = "";
		else
			str ="right of";
		
		System.out.print(str);
		
		System.out.print(" the line from (" +x0 + ", " + y0 + ") to ("+ x1 + ", " + y1 + ")");

	}
	
	
	/** Return true if point (x2, y2) is on the left side of the
	* directed line from (x0, y0) to (x1, y1) */
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return expression(x0, y0, x1, y1, x2, y2) > 0;
	}
	
	/** Return true if point (x2, y2) is on the same
	* line from (x0, y0) to (x1, y1) */
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return expression(x0, y0, x1, y1, x2, y2) == 0;
	}
	
	
	
	public static double expression(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}
	
	
}
