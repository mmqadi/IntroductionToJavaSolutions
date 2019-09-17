package ch3;
import java.util.Scanner;

public class Ch3_28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter r1's x-, y-coordinates, width and height: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double w1 = in.nextDouble();
		double h1 = in.nextDouble();
		
		System.out.print("Enter r2's x-, y-coordinates, width and height: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double w2 = in.nextDouble();
		double h2 = in.nextDouble();
		
		in.close();
		
		// check if r2 is inside r1
		if(((Math.abs(x1 -x2) + w2/2) <= w1/2) && (Math.abs(y1 - y2) + h2/2 <= h1/2)) {
			System.out.println("r2 is inside r1");
			System.exit(1);
		}
		else if((Math.abs(x1-x2) <= (w1+w2)/2) ||(Math.abs(y1 - y2) <= (h1 + h2)/2)) {
			System.out.println("r2 is overlaps r1");
			System.exit(1);
		}
		else {
			System.out.println("r2 does not overlap r1");
		}
		
	}

}
