package ch4;
import java.util.Scanner;
public class Ch4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		input.close();
		if(decimal < 0 || decimal > 15) {
			System.out.print(decimal + " is an invalid input");
			System.exit(1);
		}
		
		if(decimal > 9) {
			char hex = (char)('A' + decimal - 10);
			System.out.print("The hex value is " + hex);
		}
		else {
			System.out.print("The hex value is " + decimal);
		}
		
	}

}
