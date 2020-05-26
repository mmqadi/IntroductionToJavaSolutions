package ch7;
import java.util.Scanner;
public class Ch7_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] scores;
		
		System.out.print("Enter the number of students: ");
		scores = new int[input.nextInt()];
		
		System.out.print("Enter " + scores.length + "scores: ");
		int bestScore = Integer.MIN_VALUE;
		for(int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
			if(scores[i] > bestScore)
				bestScore = scores[i];
		}
		input.close();
		for(int i = 0; i < scores.length; i++) {
			
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade(scores[i], bestScore));
		}
	}
	
	public static char grade(int mark, int bestScore) {
		
		if(mark >= bestScore - 10)
			return 'A';
		if(mark >= bestScore - 20)
			return 'B';
		if(mark >= bestScore - 30)
			return 'C';
		if(mark >= bestScore - 40)
			return 'D';
		else
			return 'F';
	}

}
