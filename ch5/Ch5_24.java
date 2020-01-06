package ch5;

public class Ch5_24 {

	public static void main(String[] args) {
		
		
		// sum variable
		double sum = 0;
		
		for(double i = 1, j = 3; i <= 97 && j <= 99; i = i+2, j =j+2)
			sum += i/j;
		
		System.out.println("The sum of the series is: " + sum); 

	}

}
