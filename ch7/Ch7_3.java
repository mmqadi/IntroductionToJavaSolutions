package ch7;

import java.util.Scanner;

public class Ch7_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numbers[] = new int[100];
		
		System.out.print("Enter the integers between 1 and 100: ");
		int n = input.nextInt();
		while(n != 0) {
			numbers[n-1]++;
			n = input.nextInt();
		}
		input.close();
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] != 0)
				System.out.println((i + 1) + " occurs " + numbers[i] + " time" + (numbers[i]>1?"s":""));
		}

	}
	

}
