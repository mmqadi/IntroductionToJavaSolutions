package ch7;

import java.util.Scanner;

public class Ch7_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double scores[] = new double[100];
		
		System.out.print("Enter scores, enter a negative number to signify end of input: ");
		
		double score = input.nextInt();
		double sum = 0;
		int scoreCount = 0;
		
		while(score >= 0) {
			scoreCount++;
			sum += score;
			
			scores[scoreCount - 1] = score;
			score = input.nextInt();
			if(scoreCount == 100)
				break;
		}
		input.close();
		double average = sum / scoreCount;
		int aboveAverageCount = 0;
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] >= average)
				aboveAverageCount++;
		}
		
		System.out.print("The number of scores equal or above average is " + aboveAverageCount + " and the number of scores below avarage is " +
		(scoreCount - aboveAverageCount));
		

	}

}
