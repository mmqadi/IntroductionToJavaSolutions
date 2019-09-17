package ch3;

import java.util.Scanner;

public class Ch3_34 {

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
		
		position = expression==0?1:0;
		boolean inLine = false;
		
		if(position == 1 && (x2 >= x0 && x2 <= x1)) {
			inLine = true;
		}
		
		System.out.println("(" + x2 + ", " + y2 + ") is " + (position==1 && inLine?"on":"not on") + " the line " + 
				"segment from (" +x0 + ", " + y0 + ") to ("+ x1 + ", " + y1 + ")");
	}

}
