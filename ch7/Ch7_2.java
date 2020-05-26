package ch7;
import java.util.Scanner;
public class Ch7_2 {

	public static void main(String[] args) {
		
		int[] numbers = readNumbers();
		
		System.out.print("The numbers you entered are: ");
		printNumbers(numbers, false);
		System.out.print("The numbers in reverse are: ");
		printNumbers(numbers, true);
	}
	

	public static void printNumbers(int[] numbers, boolean reverse){
		
		if(reverse) {
			for(int i = numbers.length - 1; i >= 0; i--) {
				System.out.print(numbers[i] + " ");
			}
		}
		else {
			for(int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
	}
	
	public static int[] readNumbers() {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		input.close();
		return numbers;
	}

}
