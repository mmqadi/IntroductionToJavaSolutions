package ch7;

import java.util.Scanner;

public class Ch7_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int noOfBalls;
		int noOfSlots;
		
		System.out.print("Enter the number of balls to drop: ");
		noOfBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		noOfSlots = input.nextInt();
		System.out.println();
		int[] slots = new int[noOfSlots];
		
		for(int ball = 1; ball <= noOfBalls; ball++) {
			String results = "";
			int min = 0;
			int max = slots.length - 1;
			for(int i = 1; i < noOfSlots; i++) {
				boolean isLeft = (int)(Math.random() * 10) < 5;
				if(isLeft)
					max--;
				else
					min++;
				if(min == max)
					slots[min]++;
				results += isLeft?"L":"R";
			}
			System.out.println(results);
		}
		System.out.println();
		
		display(slots);
		input.close();
		
	}
	
	public static int max(int[] a) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		
		return max;
	}
	
	public static void display(int[] a) {
		int rows = max(a);
		System.out.println();
		for(int i = rows; i> 0; i--) {
			for(int col = 1; col < a.length; col++) {
				if(a[col] == i) {
					System.out.print("O");
					a[col]--;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
