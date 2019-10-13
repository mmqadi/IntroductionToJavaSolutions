package ch4;


public class Ch4_6 {
	public static double RADIUS = 40;
	public static void main(String[] args) {
		
		// generate random angles in radians
		double angle1 = Math.random() * 2 * Math.PI;
		double angle2 = Math.random() * 2 * Math.PI;
		double angle3 = Math.random() * 2 * Math.PI;
		
		// calculate the coordinates in the circle with the given radius.
		double x1 = RADIUS * Math.cos(angle1);
		double y1 = RADIUS * Math.sin(angle1);
		
		double x2 = RADIUS * Math.cos(angle2);
		double y2 = RADIUS * Math.sin(angle2);
		
		double x3 = RADIUS * Math.cos(angle3);
		double y3 = RADIUS * Math.sin(angle3);
		
		// determine the lengths sides of the triangles
		double a = Math.sqrt((x1 - x2) * (x1 - x2) +(y1 - y2) * (y1 - y2));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) +(y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x3 - x2) * (x3 - x2) +(y3 - y2) * (y3 - y2));
		
		// angles of the triangle
		double aa = a * a;
		double bb = b * b;
		double cc = c * c;
		
		double angleA = Math.acos((bb + cc - aa)/(2 * b * c));
		angleA = Math.toDegrees(angleA);
		double angleB = Math.acos((aa + cc - bb)/(2 * a * c));
		angleB = Math.toDegrees(angleB);
		double angleC = Math.acos((aa + bb - cc)/(2 * a * b));
		angleC = Math.toDegrees(angleC);
		
		System.out.printf("The angles of the traingle are %4.2f, %4.2f and %4.2f.", angleA, angleB, angleC);
		
	}

}
