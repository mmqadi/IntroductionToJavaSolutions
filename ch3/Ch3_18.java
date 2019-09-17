package ch3;
import java.util.Scanner;
public class Ch3_18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package: ");
		double weight = in.nextDouble();
		in.close();
		if(weight > 50) {
			System.out.println("the package cannot be shipped.");
			System.exit(1);
		}
		
		double cost = 0.0;
		
		if(weight <= 1)
			cost = 3.5;
		else if(weight <= 3)
			cost = 5.5;
		else if(weight <= 10)
			cost = 8.5;
		else 
			cost = 10.5;
		System.out.println("The cost of shipping the package is R" + cost);
	}

}
