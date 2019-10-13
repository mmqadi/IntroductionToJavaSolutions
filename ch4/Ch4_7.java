package ch4;
import java.util.Scanner;
public class Ch4_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		input.close();
		System.out.println("The coordinates of five points on the pentagon are");
		double angle = 0.5 * Math.PI;
		
		double x = radius * Math.cos(angle);
		double y = radius * Math.sin(angle);
		System.out.printf("(%4.2f, %4.2f) \n",x, y);
		
		angle += 0.4 * Math.PI;
		x = radius * Math.cos(angle);
		y = radius * Math.sin(angle);
		System.out.printf("(%4.2f, %4.2f) \n",x, y);
		
		angle += 0.4 * Math.PI;
		x = radius * Math.cos(angle);
		y = radius * Math.sin(angle);
		System.out.printf("(%4.2f, %4.2f) \n",x, y);

		angle += 0.4 * Math.PI;
		x = radius * Math.cos(angle);
		y = radius * Math.sin(angle);
		System.out.printf("(%4.2f, %4.2f) \n",x, y);
		
		angle += 0.4 * Math.PI;
		x = radius * Math.cos(angle);
		y = radius * Math.sin(angle);
		System.out.printf("(%4.2f, %4.2f) \n",x, y);
		
		
		
		
	}

}
