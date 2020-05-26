package ch7;
import java.util.Scanner;


public class Ch7_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		input.close();
		System.out.println("The minimum number is " + min(numbers));
	}
	
	public static double min(double[] array) {
		
		double min = Double.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++)
			if(array[i] < min)
				min = array[i];
		
		return min;
	}

}
