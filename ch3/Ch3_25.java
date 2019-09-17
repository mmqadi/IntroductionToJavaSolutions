package ch3;
import java.util.Scanner;
public class Ch3_25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4:  ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		double x4 = in.nextDouble();
		double y4 = in.nextDouble();
		in.close();
		
		double a = y1 - y2;
		double b = x2 - x1;
		double e = a * x1 + b * y1;
		double c = y3 - y4;
		double d = x4 - x3;
		double f = c * x3 + d * y3;
		
		double denominator = a * d - b * c;
		if(denominator == 0) {
			System.out.println("The two lines are parallel");
			System.exit(1);
		}
		else {
			double x = (e * d - b * f) / denominator;
			double y = (a * f - e * c) / denominator;
			
			System.out.println("The intersection point is at (" + x + ", " + y + ")");
		}
	}

}
